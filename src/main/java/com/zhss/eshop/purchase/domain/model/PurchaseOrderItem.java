package com.zhss.eshop.purchase.domain.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 采购单中的商品条目
    */
@Data
public class PurchaseOrderItem {
    /**
    * 主键
    */
    private Long id;

    /**
    * 采购单ID
    */
    private Long purchaseOrderId;

    /**
    * 商品SKU ID
    */
    private Long goodsSkuId;

    /**
    * 采购数量
    */
    private Long purchaseCount;

    /**
    * 采购价格
    */
    private BigDecimal purchasePrice;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
