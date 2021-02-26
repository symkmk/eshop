package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.model.CommodityCategoryPropertyRelationship;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityCategoryPropertyRelationshipMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityCategoryPropertyRelationship record);

    CommodityCategoryPropertyRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityCategoryPropertyRelationship record);
}
