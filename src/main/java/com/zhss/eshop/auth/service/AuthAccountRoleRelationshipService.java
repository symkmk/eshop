package com.zhss.eshop.auth.service;

import com.zhss.eshop.auth.domain.dao.AuthAccountRoleRelationship;
public interface AuthAccountRoleRelationshipService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthAccountRoleRelationship record);

    AuthAccountRoleRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthAccountRoleRelationship record);

}
