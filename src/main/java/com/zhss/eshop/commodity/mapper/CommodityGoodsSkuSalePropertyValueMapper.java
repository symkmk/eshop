package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.model.CommodityGoodsSkuSalePropertyValue;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityGoodsSkuSalePropertyValueMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsSkuSalePropertyValue record);

    CommodityGoodsSkuSalePropertyValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsSkuSalePropertyValue record);
}
