package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.model.CommodityGoods;
public interface CommodityGoodsService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoods record);

    CommodityGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoods record);

}
