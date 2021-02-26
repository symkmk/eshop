package com.zhss.eshop.auth.service;

import com.zhss.eshop.auth.domain.model.AuthRolePriorityRelationship;
public interface AuthRolePriorityRelationshipService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthRolePriorityRelationship record);

    AuthRolePriorityRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthRolePriorityRelationship record);

}
