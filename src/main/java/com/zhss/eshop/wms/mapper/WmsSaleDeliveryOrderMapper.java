package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.model.WmsSaleDeliveryOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsSaleDeliveryOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSaleDeliveryOrder record);

    WmsSaleDeliveryOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSaleDeliveryOrder record);
}
