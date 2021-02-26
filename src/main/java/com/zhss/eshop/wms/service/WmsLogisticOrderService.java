package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.dao.WmsLogisticOrder;
public interface WmsLogisticOrderService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsLogisticOrder record);

    WmsLogisticOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsLogisticOrder record);

}
