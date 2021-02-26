package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.dao.CommodityGoodsDetail;
public interface CommodityGoodsDetailService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsDetail record);

    CommodityGoodsDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsDetail record);

}
