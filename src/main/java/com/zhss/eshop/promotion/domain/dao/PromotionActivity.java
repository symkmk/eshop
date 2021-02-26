package com.zhss.eshop.promotion.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 促销活动表
    */
@Data
public class PromotionActivity {
    /**
    * 主键
    */
    private Long id;

    /**
    * 促销活动名称
    */
    private String name;

    /**
    * 促销活动开始时间
    */
    private Date startTime;

    /**
    * 促销活动结束时间
    */
    private Date endTime;

    /**
    * 促销活动说明备注
    */
    private String remark;

    /**
    * 促销活动的状态，1：启用，2：停用
    */
    private Byte status;

    /**
    * 促销活动的规则
    */
    private String rule;

    /**
    * 促销活动的类型，1：满减；2：多买优惠；3：单品促销；4：满赠促销；5：赠品促销
    */
    private Byte type;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}