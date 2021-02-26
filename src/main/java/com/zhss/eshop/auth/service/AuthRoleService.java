package com.zhss.eshop.auth.service;

import com.zhss.eshop.auth.domain.model.AuthRole;
public interface AuthRoleService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthRole record);

    AuthRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthRole record);

}
