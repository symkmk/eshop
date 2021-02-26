package com.zhss.eshop.wms.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * wms中心的采购入库单条目表
    */
@Data
public class WmsPurchaseInputOrderItem {
    /**
    * 主键
    */
    private Long id;

    /**
    * 采购入库单ID
    */
    private Long purchaseInputOrderId;

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
    private Long purchasePrice;

    /**
    * 合格商品的数量
    */
    private Long qualifiedCount;

    /**
    * 到货的商品数量
    */
    private Long arrivalCount;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
