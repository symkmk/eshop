package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.model.CommodityCategory;
public interface CommodityCategoryService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityCategory record);

    CommodityCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityCategory record);

}
