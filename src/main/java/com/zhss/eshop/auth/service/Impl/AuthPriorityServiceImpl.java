package com.zhss.eshop.auth.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.auth.mapper.AuthPriorityMapper;
import com.zhss.eshop.auth.domain.model.AuthPriority;
import com.zhss.eshop.auth.service.AuthPriorityService;
@Service
public class AuthPriorityServiceImpl implements AuthPriorityService{

    @Resource
    private AuthPriorityMapper authPriorityMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return authPriorityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(AuthPriority record) {
        return authPriorityMapper.insertSelective(record);
    }

    @Override
    public AuthPriority selectByPrimaryKey(Long id) {
        return authPriorityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AuthPriority record) {
        return authPriorityMapper.updateByPrimaryKeySelective(record);
    }

}
