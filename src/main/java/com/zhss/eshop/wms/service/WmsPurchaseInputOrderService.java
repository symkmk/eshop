package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.dao.WmsPurchaseInputOrder;
public interface WmsPurchaseInputOrderService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsPurchaseInputOrder record);

    WmsPurchaseInputOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsPurchaseInputOrder record);

}
