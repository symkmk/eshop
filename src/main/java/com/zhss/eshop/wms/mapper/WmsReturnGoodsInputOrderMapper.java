package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.dao.WmsReturnGoodsInputOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsReturnGoodsInputOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsReturnGoodsInputOrder record);

    WmsReturnGoodsInputOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsReturnGoodsInputOrder record);
}