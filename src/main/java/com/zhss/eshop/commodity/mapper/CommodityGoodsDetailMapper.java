package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.dao.CommodityGoodsDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityGoodsDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsDetail record);

    CommodityGoodsDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsDetail record);
}