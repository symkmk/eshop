package com.zhss.eshop.auth.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.auth.mapper.AuthRolePriorityRelationshipMapper;
import com.zhss.eshop.auth.domain.dao.AuthRolePriorityRelationship;
import com.zhss.eshop.auth.service.AuthRolePriorityRelationshipService;
@Service
public class AuthRolePriorityRelationshipServiceImpl implements AuthRolePriorityRelationshipService{

    @Resource
    private AuthRolePriorityRelationshipMapper authRolePriorityRelationshipMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return authRolePriorityRelationshipMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(AuthRolePriorityRelationship record) {
        return authRolePriorityRelationshipMapper.insertSelective(record);
    }

    @Override
    public AuthRolePriorityRelationship selectByPrimaryKey(Long id) {
        return authRolePriorityRelationshipMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AuthRolePriorityRelationship record) {
        return authRolePriorityRelationshipMapper.updateByPrimaryKeySelective(record);
    }

}
