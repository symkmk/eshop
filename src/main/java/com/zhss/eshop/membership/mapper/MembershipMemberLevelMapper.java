package com.zhss.eshop.membership.mapper;

import com.zhss.eshop.membership.domain.model.MembershipMemberLevel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembershipMemberLevelMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipMemberLevel record);

    MembershipMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipMemberLevel record);
}
