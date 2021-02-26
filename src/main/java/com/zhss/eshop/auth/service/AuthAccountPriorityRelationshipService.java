package com.zhss.eshop.auth.service;

import com.zhss.eshop.auth.domain.dao.AuthAccountPriorityRelationship;
public interface AuthAccountPriorityRelationshipService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthAccountPriorityRelationship record);

    AuthAccountPriorityRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthAccountPriorityRelationship record);

}
