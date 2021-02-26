package com.zhss.eshop.auth.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.auth.domain.model.AuthAccountRoleRelationship;
import com.zhss.eshop.auth.mapper.AuthAccountRoleRelationshipMapper;
import com.zhss.eshop.auth.service.AuthAccountRoleRelationshipService;
@Service
public class AuthAccountRoleRelationshipServiceImpl implements AuthAccountRoleRelationshipService{

    @Resource
    private AuthAccountRoleRelationshipMapper authAccountRoleRelationshipMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return authAccountRoleRelationshipMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(AuthAccountRoleRelationship record) {
        return authAccountRoleRelationshipMapper.insertSelective(record);
    }

    @Override
    public AuthAccountRoleRelationship selectByPrimaryKey(Long id) {
        return authAccountRoleRelationshipMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AuthAccountRoleRelationship record) {
        return authAccountRoleRelationshipMapper.updateByPrimaryKeySelective(record);
    }

}
