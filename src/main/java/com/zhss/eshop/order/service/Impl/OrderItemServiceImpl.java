package com.zhss.eshop.order.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.order.domain.model.OrderItem;
import com.zhss.eshop.order.mapper.OrderItemMapper;
import com.zhss.eshop.order.service.OrderItemService;
@Service
public class OrderItemServiceImpl implements OrderItemService{

    @Resource
    private OrderItemMapper orderItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(OrderItem record) {
        return orderItemMapper.insertSelective(record);
    }

    @Override
    public OrderItem selectByPrimaryKey(Long id) {
        return orderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderItem record) {
        return orderItemMapper.updateByPrimaryKeySelective(record);
    }

}
