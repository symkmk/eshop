package com.zhss.eshop.membership.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.membership.mapper.MembershipMemberPointDetailMapper;
import com.zhss.eshop.membership.domain.dao.MembershipMemberPointDetail;
import com.zhss.eshop.membership.service.MembershipMemberPointDetailService;
@Service
public class MembershipMemberPointDetailServiceImpl implements MembershipMemberPointDetailService{

    @Resource
    private MembershipMemberPointDetailMapper membershipMemberPointDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return membershipMemberPointDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(MembershipMemberPointDetail record) {
        return membershipMemberPointDetailMapper.insertSelective(record);
    }

    @Override
    public MembershipMemberPointDetail selectByPrimaryKey(Long id) {
        return membershipMemberPointDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MembershipMemberPointDetail record) {
        return membershipMemberPointDetailMapper.updateByPrimaryKeySelective(record);
    }

}
