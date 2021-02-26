package com.zhss.eshop.wms.service;

import com.zhss.eshop.wms.domain.model.WmsSendOutOrder;
public interface WmsSendOutOrderService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSendOutOrder record);

    WmsSendOutOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSendOutOrder record);

}
