package com.zhss.eshop.membership.mapper;

import com.zhss.eshop.membership.domain.dao.MembershipUserDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembershipUserDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipUserDetail record);

    MembershipUserDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipUserDetail record);
}