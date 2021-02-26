package com.zhss.eshop.wms.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 调度中心的商品库存
    */
@Data
public class WmsGoodsStock {
    /**
    * 主键
    */
    private Long id;

    /**
    * 商品sku ID
    */
    private Long goodsSkuId;

    /**
    * 可用库存数量
    */
    private Long availableStockQuantity;

    /**
    * 锁定库存数量
    */
    private Long lockedStockQuantity;

    /**
    * 已出库库存数量
    */
    private Long outputStockQuantity;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}