package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.model.WmsReturnGoodsInputOrderItem;
public interface WmsReturnGoodsInputOrderItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsReturnGoodsInputOrderItem record);

    WmsReturnGoodsInputOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsReturnGoodsInputOrderItem record);

}
