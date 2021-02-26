package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.dao.CommodityGoodsPropertyValue;
public interface CommodityGoodsPropertyValueService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsPropertyValue record);

    CommodityGoodsPropertyValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsPropertyValue record);

}
