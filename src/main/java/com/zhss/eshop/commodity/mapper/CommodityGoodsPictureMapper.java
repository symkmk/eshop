package com.zhss.eshop.commodity.mapper;

import com.zhss.eshop.commodity.domain.dao.CommodityGoodsPicture;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityGoodsPictureMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CommodityGoodsPicture record);

    CommodityGoodsPicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityGoodsPicture record);
}