package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.model.WmsPurchaseInputOrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsPurchaseInputOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsPurchaseInputOrderItem record);

    WmsPurchaseInputOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsPurchaseInputOrderItem record);
}
