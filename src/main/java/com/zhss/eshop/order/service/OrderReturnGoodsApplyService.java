package com.zhss.eshop.order.service;

import com.zhss.eshop.order.domain.model.OrderReturnGoodsApply;
public interface OrderReturnGoodsApplyService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderReturnGoodsApply record);

    OrderReturnGoodsApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderReturnGoodsApply record);

}
