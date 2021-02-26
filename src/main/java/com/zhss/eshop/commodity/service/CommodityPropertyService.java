package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.model.CommodityProperty;
public interface CommodityPropertyService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityProperty record);

    CommodityProperty selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityProperty record);

}
