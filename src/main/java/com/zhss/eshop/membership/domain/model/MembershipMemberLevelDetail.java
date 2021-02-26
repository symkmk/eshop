package com.zhss.eshop.membership.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 会员等级变更的明细表
    */
@Data
public class MembershipMemberLevelDetail {
    /**
    * 主键
    */
    private Long id;

    /**
    * 用户账号id
    */
    private Long userAccountId;

    /**
    * 本次变动之前的成长值
    */
    private Long oldGrowthValue;

    /**
    * 本次变动了多少成长值
    */
    private Long updatedGrowthValue;

    /**
    * 本次变动之后的成长值
    */
    private Long newGrowthValue;

    /**
    * 本次变动之前的会员等级
    */
    private Byte oldMemberLevel;

    /**
    * 本次变动后的会员级别
    */
    private Byte newMemberLevel;

    /**
    * 变动原因
    */
    private String updateReason;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
