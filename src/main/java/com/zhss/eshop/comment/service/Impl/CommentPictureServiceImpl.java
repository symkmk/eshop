package com.zhss.eshop.comment.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.comment.domain.dao.CommentPicture;
import com.zhss.eshop.comment.mapper.CommentPictureMapper;
import com.zhss.eshop.comment.service.CommentPictureService;
@Service
public class CommentPictureServiceImpl implements CommentPictureService{

    @Resource
    private CommentPictureMapper commentPictureMapper;

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

}
