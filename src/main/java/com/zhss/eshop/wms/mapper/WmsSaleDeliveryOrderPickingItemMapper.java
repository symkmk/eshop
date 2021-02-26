package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.dao.WmsSaleDeliveryOrderPickingItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsSaleDeliveryOrderPickingItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSaleDeliveryOrderPickingItem record);

    WmsSaleDeliveryOrderPickingItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSaleDeliveryOrderPickingItem record);
}