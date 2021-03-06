package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.model.CommodityProperty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommodityPropertyMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityProperty record);

    CommodityProperty selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityProperty record);

    List<CommodityProperty> listPropertiesByPage();

}
