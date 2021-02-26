package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.model.CommodityGoodsPropertyValue;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityGoodsPropertyValueMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsPropertyValue record);

    CommodityGoodsPropertyValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsPropertyValue record);
}
