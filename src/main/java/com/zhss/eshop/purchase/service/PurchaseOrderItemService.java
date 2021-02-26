package com.zhss.eshop.purchase.service;

import com.zhss.eshop.purchase.domain.dao.PurchaseOrderItem;
public interface PurchaseOrderItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(PurchaseOrderItem record);

    PurchaseOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PurchaseOrderItem record);

}
