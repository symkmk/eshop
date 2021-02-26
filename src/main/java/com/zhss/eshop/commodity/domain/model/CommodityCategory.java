package com.zhss.eshop.commodity.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 商品中心的类目表
    */
@Data
public class CommodityCategory {
    /**
    * 主键
    */
    private Long id;

    /**
    * 类目名称
    */
    private String name;

    /**
    * 类目描述
    */
    private String description;

    /**
    * 父类目的主键
    */
    private Long parentId;

    /**
    * 是否为叶子类目，1：是，0：否
    */
    private Byte isLeaf;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
