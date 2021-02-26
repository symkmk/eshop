package com.zhss.eshop.membership.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 会员中心的会员积分表
    */
@Data
public class MembershipMemberPoint {
    /**
    * 主键
    */
    private Long id;

    /**
    * 会员账号ID
    */
    private Long userAccountId;

    /**
    * 会员积分
    */
    private Long point;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
