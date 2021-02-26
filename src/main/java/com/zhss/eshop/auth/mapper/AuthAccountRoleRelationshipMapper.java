package com.zhss.eshop.auth.mapper;

import com.zhss.eshop.auth.domain.dao.AuthAccountRoleRelationship;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthAccountRoleRelationshipMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthAccountRoleRelationship record);

    AuthAccountRoleRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthAccountRoleRelationship record);
}