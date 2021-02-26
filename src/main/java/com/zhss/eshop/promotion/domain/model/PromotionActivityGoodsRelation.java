package com.zhss.eshop.promotion.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 促销活动跟商品sku的关联关系
    */
@Data
public class PromotionActivityGoodsRelation {
    /**
    * 主键
    */
    private Long id;

    /**
    * 促销活动ID
    */
    private Long promotionActivityId;

    /**
    * 关联的某个商品sku的ID，如果将这个字段的值设置为-1，那么代表针对全部商品
    */
    private Long goodsId;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
