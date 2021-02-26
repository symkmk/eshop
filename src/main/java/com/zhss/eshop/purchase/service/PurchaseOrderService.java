package com.zhss.eshop.purchase.service;

import com.zhss.eshop.purchase.domain.model.PurchaseOrder;
public interface PurchaseOrderService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(PurchaseOrder record);

    PurchaseOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PurchaseOrder record);

}
