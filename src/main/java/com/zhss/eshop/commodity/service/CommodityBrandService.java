package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.model.CommodityBrand;
public interface CommodityBrandService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityBrand record);

    CommodityBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityBrand record);

}
