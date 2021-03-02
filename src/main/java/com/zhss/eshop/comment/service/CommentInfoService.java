package com.zhss.eshop.comment.service;

import com.zhss.eshop.comment.domain.dto.CommentInfoDTO;
import com.zhss.eshop.comment.domain.model.CommentInfo;
import com.zhss.eshop.order.domain.dto.OrderInfoDTO;
import com.zhss.eshop.order.domain.dto.OrderItemDTO;

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

    /**
     * 新增自动发表的评论信息
     * @param orderInfoDTO 订单信息DTO对象
     * @param orderItemDTO 订单条目DTO对象
     * @return 处理结果
     * @throws Exception
     */
    CommentInfoDTO saveAutoPublishedCommentInfo(
            OrderInfoDTO orderInfoDTO, OrderItemDTO orderItemDTO) throws Exception;
}
