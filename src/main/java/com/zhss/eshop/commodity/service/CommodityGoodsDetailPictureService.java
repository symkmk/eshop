package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.model.CommodityGoodsDetailPicture;
public interface CommodityGoodsDetailPictureService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsDetailPicture record);

    CommodityGoodsDetailPicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsDetailPicture record);

}
