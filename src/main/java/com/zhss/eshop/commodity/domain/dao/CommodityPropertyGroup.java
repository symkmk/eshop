package com.zhss.eshop.commodity.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 商品中心的属性分组表
    */
@Data
public class CommodityPropertyGroup {
    /**
    * 主键
    */
    private Long id;

    /**
    * 属性分组名称
    */
    private String name;

    /**
    * 所属的类目ID
    */
    private Long categoryId;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}