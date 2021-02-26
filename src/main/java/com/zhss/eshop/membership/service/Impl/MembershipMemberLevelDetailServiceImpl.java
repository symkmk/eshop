package com.zhss.eshop.membership.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.membership.mapper.MembershipMemberLevelDetailMapper;
import com.zhss.eshop.membership.domain.model.MembershipMemberLevelDetail;
import com.zhss.eshop.membership.service.MembershipMemberLevelDetailService;
@Service
public class MembershipMemberLevelDetailServiceImpl implements MembershipMemberLevelDetailService{

    @Resource
    private MembershipMemberLevelDetailMapper membershipMemberLevelDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return membershipMemberLevelDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(MembershipMemberLevelDetail record) {
        return membershipMemberLevelDetailMapper.insertSelective(record);
    }

    @Override
    public MembershipMemberLevelDetail selectByPrimaryKey(Long id) {
        return membershipMemberLevelDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MembershipMemberLevelDetail record) {
        return membershipMemberLevelDetailMapper.updateByPrimaryKeySelective(record);
    }

}
