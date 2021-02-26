package com.zhss.eshop.membership.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.membership.domain.model.MembershipUserAccount;
import com.zhss.eshop.membership.mapper.MembershipUserAccountMapper;
import com.zhss.eshop.membership.service.MembershipUserAccountService;
@Service
public class MembershipUserAccountServiceImpl implements MembershipUserAccountService{

    @Resource
    private MembershipUserAccountMapper membershipUserAccountMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return membershipUserAccountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(MembershipUserAccount record) {
        return membershipUserAccountMapper.insertSelective(record);
    }

    @Override
    public MembershipUserAccount selectByPrimaryKey(Long id) {
        return membershipUserAccountMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MembershipUserAccount record) {
        return membershipUserAccountMapper.updateByPrimaryKeySelective(record);
    }

}
