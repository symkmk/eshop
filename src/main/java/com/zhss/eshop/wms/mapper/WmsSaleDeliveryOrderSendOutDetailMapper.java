package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.model.WmsSaleDeliveryOrderSendOutDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsSaleDeliveryOrderSendOutDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSaleDeliveryOrderSendOutDetail record);

    WmsSaleDeliveryOrderSendOutDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSaleDeliveryOrderSendOutDetail record);
}
