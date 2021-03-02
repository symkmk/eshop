package com.zhss.eshop.order.service;

import com.zhss.eshop.order.domain.dto.OrderInfoDTO;
import com.zhss.eshop.order.domain.model.OrderInfo;
public interface OrderInfoService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderInfo record);

    /**
     * 根据id查询订单
     * @param id 订单id
     * @return 订单
     * @throws Exception
     */
    OrderInfoDTO getById(Long id) throws Exception;



}
