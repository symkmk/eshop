package com.zhss.eshop.auth.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.auth.mapper.AuthAccountMapper;
import com.zhss.eshop.auth.domain.model.AuthAccount;
import com.zhss.eshop.auth.service.AuthAccountService;
@Service
public class AuthAccountServiceImpl implements AuthAccountService{

    @Resource
    private AuthAccountMapper authAccountMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return authAccountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(AuthAccount record) {
        return authAccountMapper.insertSelective(record);
    }

    @Override
    public AuthAccount selectByPrimaryKey(Long id) {
        return authAccountMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AuthAccount record) {
        return authAccountMapper.updateByPrimaryKeySelective(record);
    }

}
