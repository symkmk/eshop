package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.dao.WmsGoodsAllocation;
public interface WmsGoodsAllocationService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsGoodsAllocation record);

    WmsGoodsAllocation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsGoodsAllocation record);

}
