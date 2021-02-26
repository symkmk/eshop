package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.dao.CommodityBrand;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityBrand record);

    CommodityBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityBrand record);
}