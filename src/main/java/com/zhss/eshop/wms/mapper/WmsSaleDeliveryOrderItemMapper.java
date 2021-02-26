package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.dao.WmsSaleDeliveryOrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsSaleDeliveryOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSaleDeliveryOrderItem record);

    WmsSaleDeliveryOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSaleDeliveryOrderItem record);
}