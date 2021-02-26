package com.zhss.eshop.auth.service;

import com.zhss.eshop.auth.domain.model.AuthPriority;
public interface AuthPriorityService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthPriority record);

    AuthPriority selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthPriority record);

}
