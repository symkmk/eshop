package com.zhss.eshop.commodity.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 商品中心的属性表
    */
@Data
public class CommodityProperty {
    /**
    * 主键
    */
    private Long id;

    /**
    * 属性名称
    */
    private String propertyName;

    /**
    * 属性描述
    */
    private String propertyDesc;

    /**
    * 输入方式，1：多选，2：输入
    */
    private Byte inputType;

    /**
    * 可选值范围，如果输入方式是可选，那么需要提供一些供选择的值范围
    */
    private String inputValues;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
