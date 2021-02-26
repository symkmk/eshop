package com.zhss.eshop.commodity.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 商品详情数据
    */
@Data
public class CommodityGoodsDetail {
    /**
    * 主键
    */
    private Long id;

    /**
    * 商品ID
    */
    private Long goodsId;

    /**
    * 商品详情内容
    */
    private String detailContent;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}