package com.zhss.eshop.membership.mapper;

import com.zhss.eshop.membership.domain.model.MembershipMemberPoint;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembershipMemberPointMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipMemberPoint record);

    MembershipMemberPoint selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipMemberPoint record);
}
