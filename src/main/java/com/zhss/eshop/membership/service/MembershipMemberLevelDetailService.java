package com.zhss.eshop.membership.service;

import com.zhss.eshop.membership.domain.model.MembershipMemberLevelDetail;
public interface MembershipMemberLevelDetailService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipMemberLevelDetail record);

    MembershipMemberLevelDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipMemberLevelDetail record);

}
