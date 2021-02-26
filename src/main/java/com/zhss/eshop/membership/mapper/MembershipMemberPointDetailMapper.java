package com.zhss.eshop.membership.mapper;

import com.zhss.eshop.membership.domain.dao.MembershipMemberPointDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembershipMemberPointDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipMemberPointDetail record);

    MembershipMemberPointDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipMemberPointDetail record);
}