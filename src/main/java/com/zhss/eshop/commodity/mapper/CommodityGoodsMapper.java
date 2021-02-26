package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.model.CommodityGoods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoods record);

    CommodityGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoods record);
}
