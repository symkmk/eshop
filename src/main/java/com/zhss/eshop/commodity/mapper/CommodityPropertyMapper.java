package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.dao.CommodityProperty;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityPropertyMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityProperty record);

    CommodityProperty selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityProperty record);
}