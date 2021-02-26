package com.zhss.eshop.membership.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.membership.mapper.MembershipUserDetailMapper;
import com.zhss.eshop.membership.domain.model.MembershipUserDetail;
import com.zhss.eshop.membership.service.MembershipUserDetailService;
@Service
public class MembershipUserDetailServiceImpl implements MembershipUserDetailService{

    @Resource
    private MembershipUserDetailMapper membershipUserDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return membershipUserDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(MembershipUserDetail record) {
        return membershipUserDetailMapper.insertSelective(record);
    }

    @Override
    public MembershipUserDetail selectByPrimaryKey(Long id) {
        return membershipUserDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MembershipUserDetail record) {
        return membershipUserDetailMapper.updateByPrimaryKeySelective(record);
    }

}
