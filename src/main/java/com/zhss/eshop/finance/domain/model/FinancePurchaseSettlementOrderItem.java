package com.zhss.eshop.finance.domain.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 财务中心的采购结算单
    */
@Data
public class FinancePurchaseSettlementOrderItem {
    /**
    * 主键
    */
    private Long id;

    /**
    * 采购结算单ID
    */
    private Long purchaseSettlementOrderId;

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
