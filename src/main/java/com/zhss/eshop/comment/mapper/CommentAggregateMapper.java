package com.zhss.eshop.comment.mapper;

import com.zhss.eshop.comment.domain.model.CommentAggregate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentAggregateMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommentAggregate record);

    CommentAggregate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentAggregate record);
}
