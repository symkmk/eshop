package com.zhss.eshop.promotion.domain.dto;

import lombok.Data;

import java.util.Date;

/**
    * 优惠券表
    */
@Data
public class CouponDTO {
    /**
    * 主键
    */
    private Long id;

    /**
    * 优惠券名称
    */
    private String name;

    /**
    * 优惠券类型，1：现金券，2：满减券
    */
    private Byte type;

    /**
    * 优惠券规则
    */
    private String rule;

    /**
    * 有效期开始时间
    */
    private Date validStartTime;

    /**
    * 有效期结束时间
    */
    private Date validEndTime;

    /**
    * 优惠券发行数量
    */
    private Long giveOutCount;

    /**
    * 优惠券已经领取的数量
    */
    private Long receivedCount;

    /**
    * 优惠券发放方式，1：可发放可领取，2：仅可发放，3：仅可领取
    */
    private Byte giveOutType;

    /**
    * 优惠券状态，1：未开始；2：发放中，3：已发完；4：已过期
    */
    private Byte status;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
