package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.dao.CommodityGoodsSkuSalePropertyValue;
public interface CommodityGoodsSkuSalePropertyValueService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsSkuSalePropertyValue record);

    CommodityGoodsSkuSalePropertyValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsSkuSalePropertyValue record);

}
