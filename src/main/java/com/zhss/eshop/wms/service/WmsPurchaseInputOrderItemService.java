package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.model.WmsPurchaseInputOrderItem;
public interface WmsPurchaseInputOrderItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsPurchaseInputOrderItem record);

    WmsPurchaseInputOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsPurchaseInputOrderItem record);

}
