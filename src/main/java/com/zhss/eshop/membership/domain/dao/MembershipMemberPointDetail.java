package com.zhss.eshop.membership.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 会员积分变动的明细表
    */
@Data
public class MembershipMemberPointDetail {
    /**
    * 主键
    */
    private Long id;

    /**
    * 用户账号id
    */
    private Long userAccountId;

    /**
    * 本次变动之前的会员积分
    */
    private Long oldMemberPoint;

    /**
    * 本次变动的会员积分
    */
    private Long updatedMemberPoint;

    /**
    * 本次变动之后的会员积分
    */
    private Long newMemberPoint;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;

    /**
    * 本次积分变动的原因
    */
    private String updateReason;
}