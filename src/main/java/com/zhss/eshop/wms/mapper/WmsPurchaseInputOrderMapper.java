package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.dao.WmsPurchaseInputOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsPurchaseInputOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsPurchaseInputOrder record);

    WmsPurchaseInputOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsPurchaseInputOrder record);
}