package com.zhss.eshop.comment.service;

import com.zhss.eshop.comment.domain.model.CommentAggregate;
public interface CommentAggregateService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommentAggregate record);

    CommentAggregate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentAggregate record);

}
