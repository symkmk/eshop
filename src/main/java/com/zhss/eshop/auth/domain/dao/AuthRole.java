package com.zhss.eshop.auth.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 角色表，在系统中有多个角色，每个角色可以分配一些权限
    */
@Data
public class AuthRole {
    /**
    * 主键，自增长
    */
    private Long id;

    /**
    * 角色编号
    */
    private String code;

    /**
    * 角色名称
    */
    private String name;

    /**
    * 角色的说明备注
    */
    private String remark;

    /**
    * 角色的创建时间
    */
    private Date gmtCreate;

    /**
    * 角色的修改时间
    */
    private Date gmtModified;
}