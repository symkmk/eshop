package com.zhss.eshop.inventory.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.inventory.domain.dao.InventoryOfflineStockUpdateMessage;
import com.zhss.eshop.inventory.mapper.InventoryOfflineStockUpdateMessageMapper;
import com.zhss.eshop.inventory.service.InventoryOfflineStockUpdateMessageService;
@Service
public class InventoryOfflineStockUpdateMessageServiceImpl implements InventoryOfflineStockUpdateMessageService{

    @Resource
    private InventoryOfflineStockUpdateMessageMapper inventoryOfflineStockUpdateMessageMapper;

    @Override
    public int deleteByPrimaryKey(byte[] id) {
        return inventoryOfflineStockUpdateMessageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(InventoryOfflineStockUpdateMessage record) {
        return inventoryOfflineStockUpdateMessageMapper.insertSelective(record);
    }

    @Override
    public InventoryOfflineStockUpdateMessage selectByPrimaryKey(byte[] id) {
        return inventoryOfflineStockUpdateMessageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(InventoryOfflineStockUpdateMessage record) {
        return inventoryOfflineStockUpdateMessageMapper.updateByPrimaryKeySelective(record);
    }

}
