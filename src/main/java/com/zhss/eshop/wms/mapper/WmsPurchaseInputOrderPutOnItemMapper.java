package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.dao.WmsPurchaseInputOrderPutOnItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsPurchaseInputOrderPutOnItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsPurchaseInputOrderPutOnItem record);

    WmsPurchaseInputOrderPutOnItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsPurchaseInputOrderPutOnItem record);
}