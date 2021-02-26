package com.zhss.eshop.membership.service;

import com.zhss.eshop.membership.domain.dao.MembershipMemberPoint;
public interface MembershipMemberPointService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipMemberPoint record);

    MembershipMemberPoint selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipMemberPoint record);

}
