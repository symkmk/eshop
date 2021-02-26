package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.model.WmsGoodsAllocationStock;
public interface WmsGoodsAllocationStockService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsGoodsAllocationStock record);

    WmsGoodsAllocationStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsGoodsAllocationStock record);

}
