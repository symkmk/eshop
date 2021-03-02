package com.zhss.eshop.comment.service;

import com.zhss.eshop.comment.domain.model.CommentPicture;
import org.springframework.web.multipart.MultipartFile;

public interface CommentPictureService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommentPicture record);

    CommentPicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentPicture record);

    /**
     * 保存评论晒图
     * @param appBasePath 当前应用根路径
     * @param commentInfoId 评论信息id
     * @param files 评论晒图
     * @return 处理结果
     * @throws Exception
     */
    void saveCommentPictures(String appBasePath,
                             Long commentInfoId, MultipartFile[] files) throws Exception;
}
