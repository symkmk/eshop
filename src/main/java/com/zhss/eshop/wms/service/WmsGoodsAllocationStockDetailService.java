package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.dao.WmsGoodsAllocationStockDetail;
public interface WmsGoodsAllocationStockDetailService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsGoodsAllocationStockDetail record);

    WmsGoodsAllocationStockDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsGoodsAllocationStockDetail record);

}
