package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.model.CommodityPropertyGroup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityPropertyGroupMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityPropertyGroup record);

    CommodityPropertyGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityPropertyGroup record);
}
