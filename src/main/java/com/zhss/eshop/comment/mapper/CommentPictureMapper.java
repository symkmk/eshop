package com.zhss.eshop.comment.mapper;

import com.zhss.eshop.comment.domain.model.CommentPicture;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentPictureMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommentPicture record);

    CommentPicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentPicture record);
}
