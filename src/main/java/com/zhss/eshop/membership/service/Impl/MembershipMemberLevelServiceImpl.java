package com.zhss.eshop.membership.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.membership.domain.model.MembershipMemberLevel;
import com.zhss.eshop.membership.mapper.MembershipMemberLevelMapper;
import com.zhss.eshop.membership.service.MembershipMemberLevelService;
@Service
public class MembershipMemberLevelServiceImpl implements MembershipMemberLevelService{

    @Resource
    private MembershipMemberLevelMapper membershipMemberLevelMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return membershipMemberLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(MembershipMemberLevel record) {
        return membershipMemberLevelMapper.insertSelective(record);
    }

    @Override
    public MembershipMemberLevel selectByPrimaryKey(Long id) {
        return membershipMemberLevelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MembershipMemberLevel record) {
        return membershipMemberLevelMapper.updateByPrimaryKeySelective(record);
    }

}
