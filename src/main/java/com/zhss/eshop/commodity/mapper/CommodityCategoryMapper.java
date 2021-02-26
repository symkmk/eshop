package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.model.CommodityCategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityCategory record);

    CommodityCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityCategory record);
}
