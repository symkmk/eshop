package com.zhss.eshop.auth.mapper;

import com.zhss.eshop.auth.domain.model.AuthRolePriorityRelationship;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthRolePriorityRelationshipMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthRolePriorityRelationship record);

    AuthRolePriorityRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthRolePriorityRelationship record);

    Long countByPriorityId(@Param("priorityId") Long priorityId);
}
