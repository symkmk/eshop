package com.zhss.eshop.membership.service;

import com.zhss.eshop.membership.domain.dao.MembershipMemberPointDetail;
public interface MembershipMemberPointDetailService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipMemberPointDetail record);

    MembershipMemberPointDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipMemberPointDetail record);

}
