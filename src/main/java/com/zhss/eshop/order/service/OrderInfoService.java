package com.zhss.eshop.order.service;

import com.zhss.eshop.order.domain.model.OrderInfo;
public interface OrderInfoService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderInfo record);

}
