package com.zhss.eshop.membership.service;

import com.zhss.eshop.membership.domain.model.MembershipUserDetail;
public interface MembershipUserDetailService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipUserDetail record);

    MembershipUserDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipUserDetail record);

}
