package com.zhss.eshop.commodity.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * sku商品对每个销售属性的一个实际值
    */
@Data
public class CommodityGoodsSkuSalePropertyValue {
    /**
    * 主键
    */
    private Long id;

    /**
    * sku ID
    */
    private Long goodsSkuId;

    /**
    * 类目与属性关联关系的ID
    */
    private Long relationId;

    /**
    * sku对应的某个销售属性的实际值
    */
    private String propertyValue;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}