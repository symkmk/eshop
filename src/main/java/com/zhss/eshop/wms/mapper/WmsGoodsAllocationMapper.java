package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.model.WmsGoodsAllocation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsGoodsAllocationMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsGoodsAllocation record);

    WmsGoodsAllocation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsGoodsAllocation record);
}
