package com.zhss.eshop.auth.service;

import com.zhss.eshop.auth.domain.dao.AuthAccount;
public interface AuthAccountService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthAccount record);

    AuthAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthAccount record);

}
