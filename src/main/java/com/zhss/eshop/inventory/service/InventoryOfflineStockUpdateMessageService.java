package com.zhss.eshop.inventory.service;

import com.zhss.eshop.inventory.domain.dao.InventoryOfflineStockUpdateMessage;
public interface InventoryOfflineStockUpdateMessageService{


    int deleteByPrimaryKey(byte[] id);

    int insertSelective(InventoryOfflineStockUpdateMessage record);

    InventoryOfflineStockUpdateMessage selectByPrimaryKey(byte[] id);

    int updateByPrimaryKeySelective(InventoryOfflineStockUpdateMessage record);

}
