package com.zhss.eshop.commodity.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 商品属性值
    */
@Data
public class CommodityGoodsPropertyValue {
    /**
    * 主键
    */
    private Long id;

    /**
    * 属性值的类型，1：类目直接关联的属性的值；2：类目的属性组关联的属性的值
    */
    private Byte type;

    /**
    * 商品ID
    */
    private Long goodsId;

    /**
    * 如果type是1，那么这里是类目与属性关联关系的ID；如果type是2，那么这里是类目的属性组与属性的关联关系的id
    */
    private Long relationId;

    /**
    * 如果是可选的，那么直可能就是：黑色,白色，多个值串起来的；如果是输入的，那么就是直接输入的一个值
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
