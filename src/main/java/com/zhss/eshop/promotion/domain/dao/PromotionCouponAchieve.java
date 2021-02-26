package com.zhss.eshop.promotion.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 优惠券领取记录表
    */
@Data
public class PromotionCouponAchieve {
    /**
    * 主键
    */
    private Long id;

    /**
    * 优惠券ID
    */
    private Long couponId;

    /**
    * 用户账号ID
    */
    private Long userAccountId;

    /**
    * 是否使用过这个优惠券，1：使用了，0：未使用
    */
    private Byte isUsed;

    /**
    * 使用优惠券的时间
    */
    private Date usedTime;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}