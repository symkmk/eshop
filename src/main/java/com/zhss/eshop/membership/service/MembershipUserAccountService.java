package com.zhss.eshop.membership.service;

import com.zhss.eshop.membership.domain.model.MembershipUserAccount;
public interface MembershipUserAccountService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipUserAccount record);

    MembershipUserAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipUserAccount record);

}
