package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.dao.WmsSendOutOrderItem;
public interface WmsSendOutOrderItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSendOutOrderItem record);

    WmsSendOutOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSendOutOrderItem record);

}
