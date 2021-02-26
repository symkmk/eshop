package com.zhss.eshop.membership.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 会员中心的会员等级表
    */
@Data
public class MembershipMemberLevel {
    /**
    * 主键
    */
    private Long id;

    /**
    * 属于哪个会员账号
    */
    private Long userAccountId;

    /**
    * 成长值
    */
    private Long growthValue;

    /**
    * 会员等级，从1开始，1级，2级，3级，4级
    */
    private Byte level;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}