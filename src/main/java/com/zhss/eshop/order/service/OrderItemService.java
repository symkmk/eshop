package com.zhss.eshop.order.service;

import com.zhss.eshop.order.domain.dao.OrderItem;
public interface OrderItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderItem record);

}
