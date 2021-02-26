package com.zhss.eshop.auth.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.auth.mapper.AuthAccountPriorityRelationshipMapper;
import com.zhss.eshop.auth.domain.model.AuthAccountPriorityRelationship;
import com.zhss.eshop.auth.service.AuthAccountPriorityRelationshipService;
@Service
public class AuthAccountPriorityRelationshipServiceImpl implements AuthAccountPriorityRelationshipService{

    @Resource
    private AuthAccountPriorityRelationshipMapper authAccountPriorityRelationshipMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return authAccountPriorityRelationshipMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(AuthAccountPriorityRelationship record) {
        return authAccountPriorityRelationshipMapper.insertSelective(record);
    }

    @Override
    public AuthAccountPriorityRelationship selectByPrimaryKey(Long id) {
        return authAccountPriorityRelationshipMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AuthAccountPriorityRelationship record) {
        return authAccountPriorityRelationshipMapper.updateByPrimaryKeySelective(record);
    }

}
