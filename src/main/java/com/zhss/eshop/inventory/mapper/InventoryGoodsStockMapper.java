package com.zhss.eshop.inventory.mapper;

import com.zhss.eshop.inventory.domain.dao.InventoryGoodsStock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InventoryGoodsStockMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(InventoryGoodsStock record);

    InventoryGoodsStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InventoryGoodsStock record);
}