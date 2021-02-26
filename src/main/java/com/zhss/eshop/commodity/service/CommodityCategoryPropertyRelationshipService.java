package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.dao.CommodityCategoryPropertyRelationship;
public interface CommodityCategoryPropertyRelationshipService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityCategoryPropertyRelationship record);

    CommodityCategoryPropertyRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityCategoryPropertyRelationship record);

}
