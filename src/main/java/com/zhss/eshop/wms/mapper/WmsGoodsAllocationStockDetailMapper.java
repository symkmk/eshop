package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.model.WmsGoodsAllocationStockDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsGoodsAllocationStockDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsGoodsAllocationStockDetail record);

    WmsGoodsAllocationStockDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsGoodsAllocationStockDetail record);
}
