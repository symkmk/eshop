package com.zhss.eshop.membership.mapper;

import com.zhss.eshop.membership.domain.model.MembershipUserAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembershipUserAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipUserAccount record);

    MembershipUserAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipUserAccount record);
}
