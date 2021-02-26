package com.zhss.eshop.auth.mapper;

import com.zhss.eshop.auth.domain.dao.AuthRolePriorityRelationship;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthRolePriorityRelationshipMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthRolePriorityRelationship record);

    AuthRolePriorityRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthRolePriorityRelationship record);
}