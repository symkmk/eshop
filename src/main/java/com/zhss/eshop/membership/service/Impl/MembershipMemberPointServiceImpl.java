package com.zhss.eshop.membership.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.membership.domain.dao.MembershipMemberPoint;
import com.zhss.eshop.membership.mapper.MembershipMemberPointMapper;
import com.zhss.eshop.membership.service.MembershipMemberPointService;
@Service
public class MembershipMemberPointServiceImpl implements MembershipMemberPointService{

    @Resource
    private MembershipMemberPointMapper membershipMemberPointMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return membershipMemberPointMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(MembershipMemberPoint record) {
        return membershipMemberPointMapper.insertSelective(record);
    }

    @Override
    public MembershipMemberPoint selectByPrimaryKey(Long id) {
        return membershipMemberPointMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MembershipMemberPoint record) {
        return membershipMemberPointMapper.updateByPrimaryKeySelective(record);
    }

}
