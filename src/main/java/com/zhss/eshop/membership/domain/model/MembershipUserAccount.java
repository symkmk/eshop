package com.zhss.eshop.membership.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 会员中心的用户账号信息
    */
@Data
public class MembershipUserAccount {
    /**
    * 主键
    */
    private Long id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 手机号
    */
    private String cellPhoneNumber;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
