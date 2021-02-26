package com.zhss.eshop.inventory.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.inventory.mapper.InventoryGoodsStockMapper;
import com.zhss.eshop.inventory.domain.model.InventoryGoodsStock;
import com.zhss.eshop.inventory.service.InventoryGoodsStockService;
@Service
public class InventoryGoodsStockServiceImpl implements InventoryGoodsStockService{

    @Resource
    private InventoryGoodsStockMapper inventoryGoodsStockMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return inventoryGoodsStockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(InventoryGoodsStock record) {
        return inventoryGoodsStockMapper.insertSelective(record);
    }

    @Override
    public InventoryGoodsStock selectByPrimaryKey(Long id) {
        return inventoryGoodsStockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(InventoryGoodsStock record) {
        return inventoryGoodsStockMapper.updateByPrimaryKeySelective(record);
    }

}
