package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.dao.WmsSaleDeliveryOrder;
public interface WmsSaleDeliveryOrderService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSaleDeliveryOrder record);

    WmsSaleDeliveryOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSaleDeliveryOrder record);

}
