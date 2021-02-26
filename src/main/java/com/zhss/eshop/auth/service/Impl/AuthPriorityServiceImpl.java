package com.zhss.eshop.auth.service.Impl;

import com.zhss.eshop.auth.domain.dto.PriorityDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.zhss.eshop.auth.mapper.AuthPriorityMapper;
import com.zhss.eshop.auth.domain.model.AuthPriority;
import com.zhss.eshop.auth.service.AuthPriorityService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AuthPriorityServiceImpl implements AuthPriorityService {

    @Resource
    private AuthPriorityMapper authPriorityMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return authPriorityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PriorityDTO priorityDTO) throws Exception {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        priorityDTO.setGmtCreate(dateFormatter.parse(dateFormatter.format(new Date())));
        priorityDTO.setGmtModified(dateFormatter.parse(dateFormatter.format(new Date())));
        return authPriorityMapper.insertSelective(priorityDTO.clone(AuthPriority.class));
    }

    @Override
    public PriorityDTO selectByPrimaryKey(Long id) throws Exception {
        AuthPriority authPriority = authPriorityMapper.selectByPrimaryKey(id);
        return authPriority.clone(PriorityDTO.class);
    }

    @Override
    public int updateByPrimaryKeySelective(PriorityDTO priorityDTO) throws Exception {
        return authPriorityMapper.updateByPrimaryKeySelective(priorityDTO.clone(AuthPriority.class));
    }

    @Override
    public List<PriorityDTO> listRootPriorities() throws Exception {
        List<AuthPriority> priorityDOs = authPriorityMapper.listRootPriorities();
        if (priorityDOs == null) {
            return null;
        }
        List<PriorityDTO> priorityDTOs = new ArrayList<PriorityDTO>(priorityDOs.size());
        for (AuthPriority priorityDO : priorityDOs) {
            priorityDTOs.add(priorityDO.clone(PriorityDTO.class));
        }
        return priorityDTOs;
    }

    @Override
    public List<PriorityDTO> listChildPriorities(Long parentId) throws Exception {
        List<AuthPriority> priorityDOs = authPriorityMapper.listChildPriorities(parentId);
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
