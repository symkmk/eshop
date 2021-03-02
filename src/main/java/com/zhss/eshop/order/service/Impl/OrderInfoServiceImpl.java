package com.zhss.eshop.order.service.Impl;

import com.zhss.eshop.order.domain.dto.OrderInfoDTO;
import com.zhss.eshop.order.domain.model.OrderInfo;
import com.zhss.eshop.order.domain.model.OrderItem;
import com.zhss.eshop.order.mapper.OrderInfoMapper;
import com.zhss.eshop.order.mapper.OrderItemMapper;
import com.zhss.eshop.order.service.OrderInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderInfoServiceImpl implements OrderInfoService{

    @Resource
    private OrderInfoMapper orderInfoMapper;

    @Resource
    private OrderItemMapper orderItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(OrderInfo record) {
        return orderInfoMapper.insertSelective(record);
    }

    @Override
    public OrderInfo selectByPrimaryKey(Long id) {
        return orderInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderInfo record) {
        return orderInfoMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据id查询订单
     * @param id 订单id
     * @return 订单
     * @throws Exception
     */
    @Override
    public OrderInfoDTO getById(Long id) throws Exception {
        OrderInfo order = orderInfoMapper.selectByPrimaryKey(id);
        OrderInfoDTO orderInfoDTO=order.clone(OrderInfoDTO.class);
//        setOrderItems(order);
//        setOrderOperateLogs(order);
        return orderInfoDTO;
    }
    /**
     * 为订单查询并且设置订单条目
     * @param order 订单
     * @return 订单
     * @throws Exception
     */
    private OrderInfoDTO setOrderItems(OrderInfoDTO order) throws Exception {
//        List<OrderItemDTO> orderItems = ObjectUtils.convertList(
//                orderItemMapper.listByOrderInfoId(order.getId()),
//                OrderItemDTO.class);
        List<OrderItem> orderItems = orderItemMapper.listByOrderInfoId(order.getId());
        //// TODO: 2021/3/2 list克隆
//        order.setOrderItems(orderItems);
        return order;
    }


}
