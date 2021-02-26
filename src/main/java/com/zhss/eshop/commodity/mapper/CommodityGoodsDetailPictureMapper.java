package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.dao.CommodityGoodsDetailPicture;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityGoodsDetailPictureMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsDetailPicture record);

    CommodityGoodsDetailPicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsDetailPicture record);
}