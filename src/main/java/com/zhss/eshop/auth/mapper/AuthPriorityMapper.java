package com.zhss.eshop.auth.mapper;

import com.zhss.eshop.auth.domain.model.AuthPriority;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthPriorityMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthPriority record);

    AuthPriority selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthPriority record);
}
