package com.zhss.eshop.auth.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 账号表，电商公司里一个员工就对应着一个账号，每个账号给分配多个角色，同时这个账号也可以给分配多个权限
    */
@Data
public class AuthAccount {
    /**
    * 主键，自增长
    */
    private Long id;

    /**
    * 用户名，英文，默认是姓名的小写拼音
    */
    private String username;

    /**
    * 账号的密码
    */
    private String password;

    /**
    * 员工姓名，中文
    */
    private String name;

    /**
    * 账号的说明备注
    */
    private String remark;

    /**
    * 账号的创建时间
    */
    private Date gmtCreate;

    /**
    * 账号的更新时间
    */
    private Date gmtModified;
}
