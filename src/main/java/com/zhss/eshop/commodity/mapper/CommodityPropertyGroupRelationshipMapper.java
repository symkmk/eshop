package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.model.CommodityPropertyGroupRelationship;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityPropertyGroupRelationshipMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityPropertyGroupRelationship record);

    CommodityPropertyGroupRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityPropertyGroupRelationship record);
}
