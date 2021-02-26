package com.zhss.eshop.auth.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 账号和角色的关系表，一个账号可以对应多个角色，一个角色也可以对应多个账号
    */
@Data
public class AuthAccountRoleRelationship {
    /**
    * 主键，自增长
    */
    private Long id;

    /**
    * 账号的主键
    */
    private Long accountId;

    /**
    * 角色的主键
    */
    private Long roleId;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
