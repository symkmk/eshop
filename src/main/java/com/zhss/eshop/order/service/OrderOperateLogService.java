package com.zhss.eshop.order.service;

import com.zhss.eshop.order.domain.dao.OrderOperateLog;
public interface OrderOperateLogService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderOperateLog record);

    OrderOperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderOperateLog record);

}
