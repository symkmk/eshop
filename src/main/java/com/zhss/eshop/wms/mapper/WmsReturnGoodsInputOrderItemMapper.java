package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.dao.WmsReturnGoodsInputOrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsReturnGoodsInputOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsReturnGoodsInputOrderItem record);

    WmsReturnGoodsInputOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsReturnGoodsInputOrderItem record);
}