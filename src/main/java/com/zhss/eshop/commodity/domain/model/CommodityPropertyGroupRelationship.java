package com.zhss.eshop.commodity.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 商品中心的属性分组和属性的关联关系表
    */
@Data
public class CommodityPropertyGroupRelationship {
    /**
    * 主键
    */
    private Long id;

    /**
    * 属性分组ID
    */
    private Long propertyGroupId;

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
