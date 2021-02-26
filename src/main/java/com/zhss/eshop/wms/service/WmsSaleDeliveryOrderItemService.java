package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.dao.WmsSaleDeliveryOrderItem;
public interface WmsSaleDeliveryOrderItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSaleDeliveryOrderItem record);

    WmsSaleDeliveryOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSaleDeliveryOrderItem record);

}
