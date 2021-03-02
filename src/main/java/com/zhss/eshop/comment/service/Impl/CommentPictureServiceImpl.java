package com.zhss.eshop.comment.service.Impl;

import com.zhss.eshop.comment.constant.CommentPictureUploadDirType;
import com.zhss.eshop.comment.domain.model.CommentPicture;
import com.zhss.eshop.comment.mapper.CommentPictureMapper;
import com.zhss.eshop.comment.service.CommentPictureService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.Date;

@Service
public class CommentPictureServiceImpl implements CommentPictureService{

    @Resource
    private CommentPictureMapper commentPictureMapper;
    /**
     * 评论晒图的上传目录
     */
    @Value("${comment.picture.upload.dir}")
    private String uploadDirPath;
    /**
     * 评论晒图的上传目录的类型：relative是相对路径，absolute是绝对路径
     */
    @Value("${comment.picture.upload.dir.type}")
    private String uploadDirType;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commentPictureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommentPicture record) {
        return commentPictureMapper.insertSelective(record);
    }

    @Override
    public CommentPicture selectByPrimaryKey(Long id) {
        return commentPictureMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommentPicture record) {
        return commentPictureMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void saveCommentPictures(String appBasePath,
                                    Long commentInfoId, MultipartFile[] files) throws Exception {
        // 处理上传目录
        String realUploadDirPath = uploadDirPath;

        if(CommentPictureUploadDirType.RELATIVE.equals(uploadDirType)) {
            realUploadDirPath = appBasePath + uploadDirPath;
        }

        // 将图片上传到指定的目录中去
        // 如果上传目录不存在，则自动创建该目录
        File uploadDir = new File(realUploadDirPath);
        if(!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        for(MultipartFile file : files) {
            if(file == null) {
                continue;
            }

            // 如果目标文件路径已经存在，则删除目标文件
            //获得文件分隔符
            String fileSeparator = System.getProperties().getProperty("file.separator");
            String targetFilePath = realUploadDirPath + fileSeparator + file.getOriginalFilename();
            File targetFile = new File(targetFilePath);
            if(targetFile.exists()) {
                targetFile.delete();
            }

            // 将上传上来的文件保存到指定的文件中去
            file.transferTo(targetFile);

            // 将评论晒图信息保存到数据库中去
            CommentPicture commentPictureDO = new CommentPicture();
            commentPictureDO.setCommentInfoId(commentInfoId);
            commentPictureDO.setCommentPicturePath(targetFilePath);
            commentPictureDO.setGmtCreate(new Date());
            commentPictureDO.setGmtModified(new Date());

            commentPictureMapper.insertSelective(commentPictureDO);
        }
    }

}
