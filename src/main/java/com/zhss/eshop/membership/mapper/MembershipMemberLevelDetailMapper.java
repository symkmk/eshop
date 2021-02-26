package com.zhss.eshop.membership.mapper;

import com.zhss.eshop.membership.domain.dao.MembershipMemberLevelDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembershipMemberLevelDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipMemberLevelDetail record);

    MembershipMemberLevelDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipMemberLevelDetail record);
}