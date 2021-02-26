package com.zhss.eshop.membership.service;

import com.zhss.eshop.membership.domain.model.MembershipMemberLevel;
public interface MembershipMemberLevelService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipMemberLevel record);

    MembershipMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipMemberLevel record);

}
