package com.zhss.eshop.auth.mapper;

import com.zhss.eshop.auth.domain.dao.AuthRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthRole record);

    AuthRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthRole record);
}