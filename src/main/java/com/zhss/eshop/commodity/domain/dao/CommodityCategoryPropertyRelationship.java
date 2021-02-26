package com.zhss.eshop.commodity.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 商品中心的类目和属性的关联关系表
    */
@Data
public class CommodityCategoryPropertyRelationship {
    /**
    * 主键
    */
    private Long id;

    /**
    * 类目ID
    */
    private Long categoryId;

    /**
    * 属性ID
    */
    private Long propertyId;

    /**
    * 属性是否必填，1：是必填，0：非必填
    */
    private Byte isRequired;

    /**
    * 属性类型，1：关键属性，2：销售属性，3：非关键属性，4：导购属性，这里可以有多个值拼接在一起，比如1,2，2,4
    */
    private String propertyTypes;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}