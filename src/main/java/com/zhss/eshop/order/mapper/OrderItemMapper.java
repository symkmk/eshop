package com.zhss.eshop.order.mapper;

import com.zhss.eshop.order.domain.model.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * 查询订单条目
     * @param orderInfoId 订单id
     * @return 订单条目
     * @throws Exception
     */
    List<OrderItem> listByOrderInfoId(Long orderInfoId) throws Exception;
}
