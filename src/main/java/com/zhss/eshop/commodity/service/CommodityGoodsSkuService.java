package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.model.CommodityGoodsSku;
public interface CommodityGoodsSkuService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsSku record);

    CommodityGoodsSku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsSku record);

}
