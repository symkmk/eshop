package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.model.WmsGoodsStock;
public interface WmsGoodsStockService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsGoodsStock record);

    WmsGoodsStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsGoodsStock record);

}
