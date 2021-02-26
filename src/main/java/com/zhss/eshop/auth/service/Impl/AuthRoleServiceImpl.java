package com.zhss.eshop.auth.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.auth.mapper.AuthRoleMapper;
import com.zhss.eshop.auth.domain.model.AuthRole;
import com.zhss.eshop.auth.service.AuthRoleService;
@Service
public class AuthRoleServiceImpl implements AuthRoleService{

    @Resource
    private AuthRoleMapper authRoleMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return authRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(AuthRole record) {
        return authRoleMapper.insertSelective(record);
    }

    @Override
    public AuthRole selectByPrimaryKey(Long id) {
        return authRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AuthRole record) {
        return authRoleMapper.updateByPrimaryKeySelective(record);
    }

}
