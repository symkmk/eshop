package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.dao.WmsSaleDeliveryOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsSaleDeliveryOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSaleDeliveryOrder record);

    WmsSaleDeliveryOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSaleDeliveryOrder record);
}