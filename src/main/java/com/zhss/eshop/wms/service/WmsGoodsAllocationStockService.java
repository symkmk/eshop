package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.dao.WmsGoodsAllocationStock;
public interface WmsGoodsAllocationStockService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsGoodsAllocationStock record);

    WmsGoodsAllocationStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsGoodsAllocationStock record);

}
