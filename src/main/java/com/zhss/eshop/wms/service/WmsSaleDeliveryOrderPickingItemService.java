package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.model.WmsSaleDeliveryOrderPickingItem;
public interface WmsSaleDeliveryOrderPickingItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSaleDeliveryOrderPickingItem record);

    WmsSaleDeliveryOrderPickingItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSaleDeliveryOrderPickingItem record);

}
