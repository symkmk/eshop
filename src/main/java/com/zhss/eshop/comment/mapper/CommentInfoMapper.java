package com.zhss.eshop.comment.mapper;

import com.zhss.eshop.comment.domain.dao.CommentInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommentInfo record);

    CommentInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentInfo record);
}