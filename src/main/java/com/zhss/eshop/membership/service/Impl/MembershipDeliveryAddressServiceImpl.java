package com.zhss.eshop.membership.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.membership.domain.model.MembershipDeliveryAddress;
import com.zhss.eshop.membership.mapper.MembershipDeliveryAddressMapper;
import com.zhss.eshop.membership.service.MembershipDeliveryAddressService;
@Service
public class MembershipDeliveryAddressServiceImpl implements MembershipDeliveryAddressService{

    @Resource
    private MembershipDeliveryAddressMapper membershipDeliveryAddressMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return membershipDeliveryAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(MembershipDeliveryAddress record) {
        return membershipDeliveryAddressMapper.insertSelective(record);
    }

    @Override
    public MembershipDeliveryAddress selectByPrimaryKey(Long id) {
        return membershipDeliveryAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MembershipDeliveryAddress record) {
        return membershipDeliveryAddressMapper.updateByPrimaryKeySelective(record);
    }

}
