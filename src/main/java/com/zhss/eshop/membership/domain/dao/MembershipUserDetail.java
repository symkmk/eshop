package com.zhss.eshop.membership.domain.dao;

import java.util.Date;
import lombok.Data;

@Data
public class MembershipUserDetail {
    /**
    * 主键
    */
    private Long id;

    /**
    * 用户账号id
    */
    private Long userAccountId;

    /**
    * 真实姓名
    */
    private String name;

    /**
    * 性别，1：男，2：女
    */
    private Byte gender;

    /**
    * 生日
    */
    private Date birthday;

    /**
    * 身份证号
    */
    private String idNumber;

    /**
    * 家庭住址
    */
    private String address;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}