package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.dao.WmsSaleDeliveryOrderSendOutDetail;
public interface WmsSaleDeliveryOrderSendOutDetailService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSaleDeliveryOrderSendOutDetail record);

    WmsSaleDeliveryOrderSendOutDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSaleDeliveryOrderSendOutDetail record);

}
