package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.model.CommodityPropertyGroup;
public interface CommodityPropertyGroupService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityPropertyGroup record);

    CommodityPropertyGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityPropertyGroup record);

}
