package com.zhss.eshop.comment.service;

import com.zhss.eshop.comment.domain.dto.CommentAggregateDTO;
import com.zhss.eshop.comment.domain.dto.CommentInfoDTO;
import com.zhss.eshop.comment.domain.model.CommentAggregate;
public interface CommentAggregateService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommentAggregate record);

    CommentAggregate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentAggregate record);

    /**
     * 更新评论统计信息
     * @param commentInfoDTO 评论信息
     * @return 处理结果
     * @throws Exception
     */
    CommentAggregateDTO refreshCommentAggregate(
            CommentInfoDTO commentInfoDTO) throws Exception;

}
