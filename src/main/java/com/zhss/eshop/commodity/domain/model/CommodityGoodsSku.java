package com.zhss.eshop.commodity.domain.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 商品sku信息
    */
@Data
public class CommodityGoodsSku {
    /**
    * 主键
    */
    private Long id;

    /**
    * 商品ID
    */
    private Long goodsId;

    /**
    * sku编号
    */
    private String skuCode;

    /**
    * 采购价格
    */
    private BigDecimal purchasePrice;

    /**
    * 销售价格
    */
    private BigDecimal salePrice;

    /**
    * 促销价格
    */
    private BigDecimal discountPrice;

    /**
    * 销售属性
    */
    private String saleProperties;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
