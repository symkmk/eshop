package com.zhss.eshop.inventory.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 库存中心的商品库存表
    */
@Data
public class InventoryGoodsStock {
    /**
    * 主键
    */
    private Long id;

    /**
    * 商品sku ID
    */
    private Long goodsSkuId;

    /**
    * 销售库存
    */
    private Long saleStockQuantity;

    /**
    * 锁定库存
    */
    private Long lockedStockQuantity;

    /**
    * 已销售库存
    */
    private Long saledStockQuantity;

    /**
    * 库存状态，0：无库存，1：有库存
    */
    private Byte stockStatus;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}