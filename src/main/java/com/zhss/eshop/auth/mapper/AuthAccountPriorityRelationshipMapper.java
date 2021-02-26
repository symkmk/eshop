package com.zhss.eshop.auth.mapper;

import com.zhss.eshop.auth.domain.model.AuthAccountPriorityRelationship;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthAccountPriorityRelationshipMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthAccountPriorityRelationship record);

    AuthAccountPriorityRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthAccountPriorityRelationship record);
}
