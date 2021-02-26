package com.zhss.eshop.auth.service.Impl;

import com.zhss.eshop.auth.domain.dto.PriorityDTO;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.auth.mapper.AuthPriorityMapper;
import com.zhss.eshop.auth.domain.model.AuthPriority;
import com.zhss.eshop.auth.service.AuthPriorityService;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<PriorityDTO> listRootPriorities() throws Exception {
        List<AuthPriority> priorityDOs = authPriorityMapper.listRootPriorities();
        if(priorityDOs == null) {
            return null;
        }

        List<PriorityDTO> priorityDTOs = new ArrayList<PriorityDTO>(priorityDOs.size());
        for(AuthPriority priorityDO : priorityDOs) {
            priorityDTOs.add(priorityDO.clone(PriorityDTO.class));
        }

        return priorityDTOs;
    }

}
