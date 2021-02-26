package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.dao.CommodityPropertyGroupRelationship;
public interface CommodityPropertyGroupRelationshipService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityPropertyGroupRelationship record);

    CommodityPropertyGroupRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityPropertyGroupRelationship record);

}
