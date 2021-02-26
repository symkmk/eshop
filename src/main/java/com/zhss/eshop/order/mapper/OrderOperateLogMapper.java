package com.zhss.eshop.order.mapper;

import com.zhss.eshop.order.domain.model.OrderOperateLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderOperateLogMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderOperateLog record);

    OrderOperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderOperateLog record);
}
