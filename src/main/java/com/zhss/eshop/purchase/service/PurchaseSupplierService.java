package com.zhss.eshop.purchase.service;

import com.zhss.eshop.purchase.domain.dao.PurchaseSupplier;
public interface PurchaseSupplierService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(PurchaseSupplier record);

    PurchaseSupplier selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PurchaseSupplier record);

}
