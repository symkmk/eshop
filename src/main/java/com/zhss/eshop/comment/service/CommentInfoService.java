package com.zhss.eshop.comment.service;

import com.zhss.eshop.comment.domain.dto.CommentInfoDTO;
import com.zhss.eshop.comment.domain.model.CommentInfo;
public interface CommentInfoService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommentInfo record);

    CommentInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentInfo record);

    /**
     * 新增手动发表的评论信息
     * @param commentInfoDTO 评论信息DTO对象
     * @throws Exception
     */
    void saveManualPublishedCommentInfo(CommentInfoDTO commentInfoDTO) throws Exception;
}
