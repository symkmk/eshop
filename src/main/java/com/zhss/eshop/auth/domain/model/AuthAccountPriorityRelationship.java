package com.zhss.eshop.auth.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 账号与权限的关系表，一个账号可以对应多个权限，一个权限也可以属于多个账号
    */
@Data
public class AuthAccountPriorityRelationship {
    /**
    * 主键，自增长
    */
    private Long id;

    /**
    * 账号的主键
    */
    private Long accountId;

    /**
    * 权限的主键
    */
    private Long priorityId;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
