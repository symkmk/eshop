package com.zhss.eshop.inventory.service;

import com.zhss.eshop.inventory.domain.model.InventoryGoodsStock;
public interface InventoryGoodsStockService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(InventoryGoodsStock record);

    InventoryGoodsStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InventoryGoodsStock record);

}
