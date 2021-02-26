package com.zhss.eshop.comment.service;

import com.zhss.eshop.comment.domain.model.CommentPicture;
public interface CommentPictureService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommentPicture record);

    CommentPicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentPicture record);

}
