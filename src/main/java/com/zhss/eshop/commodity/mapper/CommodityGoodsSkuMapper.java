package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.model.CommodityGoodsSku;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityGoodsSkuMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsSku record);

    CommodityGoodsSku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsSku record);
}
