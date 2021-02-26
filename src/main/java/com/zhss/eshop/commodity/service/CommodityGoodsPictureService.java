package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.model.CommodityGoodsPicture;
public interface CommodityGoodsPictureService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsPicture record);

    CommodityGoodsPicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsPicture record);

}
