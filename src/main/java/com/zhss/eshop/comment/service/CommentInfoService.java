package com.zhss.eshop.comment.service;

import com.zhss.eshop.comment.domain.model.CommentInfo;
public interface CommentInfoService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommentInfo record);

    CommentInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentInfo record);

}
