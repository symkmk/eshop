package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.model.WmsReturnGoodsInputOrderPutOnItem;
public interface WmsReturnGoodsInputOrderPutOnItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsReturnGoodsInputOrderPutOnItem record);

    WmsReturnGoodsInputOrderPutOnItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsReturnGoodsInputOrderPutOnItem record);

}
