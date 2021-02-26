package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.model.WmsReturnGoodsInputOrderPutOnItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsReturnGoodsInputOrderPutOnItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsReturnGoodsInputOrderPutOnItem record);

    WmsReturnGoodsInputOrderPutOnItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsReturnGoodsInputOrderPutOnItem record);
}
