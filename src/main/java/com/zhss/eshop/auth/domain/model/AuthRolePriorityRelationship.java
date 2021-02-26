package com.zhss.eshop.auth.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 角色和权限的关系表，角色和权限是多对多的关系，一个角色可以对应多个权限，一个权限可以属于多个角色
    */
@Data
public class AuthRolePriorityRelationship {
    /**
    * 主键，自增长
    */
    private Long id;

    /**
    * 权限的主键
    */
    private Long priorityId;

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
