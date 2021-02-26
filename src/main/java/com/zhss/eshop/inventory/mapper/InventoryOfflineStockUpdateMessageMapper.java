package com.zhss.eshop.inventory.mapper;

import com.zhss.eshop.inventory.domain.model.InventoryOfflineStockUpdateMessage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InventoryOfflineStockUpdateMessageMapper {
    int deleteByPrimaryKey(byte[] id);

    int insertSelective(InventoryOfflineStockUpdateMessage record);

    InventoryOfflineStockUpdateMessage selectByPrimaryKey(byte[] id);

    int updateByPrimaryKeySelective(InventoryOfflineStockUpdateMessage record);
}
