package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.model.WmsGoodsAllocationStock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsGoodsAllocationStockMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsGoodsAllocationStock record);

    WmsGoodsAllocationStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsGoodsAllocationStock record);
}
