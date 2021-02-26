package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.model.WmsReturnGoodsInputOrder;
public interface WmsReturnGoodsInputOrderService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsReturnGoodsInputOrder record);

    WmsReturnGoodsInputOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsReturnGoodsInputOrder record);

}
