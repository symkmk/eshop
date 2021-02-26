package com.zhss.eshop.membership.mapper;

import com.zhss.eshop.membership.domain.dao.MembershipDeliveryAddress;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembershipDeliveryAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipDeliveryAddress record);

    MembershipDeliveryAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipDeliveryAddress record);
}