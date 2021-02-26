package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.dao.WmsPurchaseInputOrderPutOnItem;
public interface WmsPurchaseInputOrderPutOnItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsPurchaseInputOrderPutOnItem record);

    WmsPurchaseInputOrderPutOnItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsPurchaseInputOrderPutOnItem record);

}
