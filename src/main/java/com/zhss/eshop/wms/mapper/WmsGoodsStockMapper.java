package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.dao.WmsGoodsStock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsGoodsStockMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsGoodsStock record);

    WmsGoodsStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsGoodsStock record);
}