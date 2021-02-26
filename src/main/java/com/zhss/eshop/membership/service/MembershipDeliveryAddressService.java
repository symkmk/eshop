package com.zhss.eshop.membership.service;

import com.zhss.eshop.membership.domain.model.MembershipDeliveryAddress;
public interface MembershipDeliveryAddressService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(MembershipDeliveryAddress record);

    MembershipDeliveryAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MembershipDeliveryAddress record);

}
