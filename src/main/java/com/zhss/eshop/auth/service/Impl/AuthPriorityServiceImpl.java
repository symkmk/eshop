package com.zhss.eshop.auth.service.Impl;

import com.zhss.eshop.auth.domain.dto.PriorityDTO;
import com.zhss.eshop.auth.mapper.AuthAccountPriorityRelationshipMapper;
import com.zhss.eshop.auth.mapper.AuthRolePriorityRelationshipMapper;
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

    /**
     * 角色和权限关系管理模块的DAO组件
     */
    @Resource
    private AuthRolePriorityRelationshipMapper rolePriorityRelationshipDAO;
    /**
     * 账号和权限关系管理模块的DAO组件
     */
    @Resource
    private AuthAccountPriorityRelationshipMapper accountPriorityRelationshipDAO;

    @Override
    public Boolean deleteByPrimaryKey(Long id) throws Exception{
        // 根据id查询权限
        PriorityNode priority = authPriorityMapper.selectByPrimaryKey(id)
                .clone(PriorityNode.class);

        RelatedCheckPriorityOperation relatedCheckPriorityOperation=new RelatedCheckPriorityOperation(authPriorityMapper,rolePriorityRelationshipDAO,accountPriorityRelationshipDAO);
        relatedCheckPriorityOperation.visit(priority);
        Boolean relateCheckResult = relatedCheckPriorityOperation.getRelateCheckResult();

        if(relateCheckResult){
            return false;
        }

        RemovePriorityOperation removePriorityOperation=new RemovePriorityOperation(authPriorityMapper);
        removePriorityOperation.visit(priority);


        // 检查这个权限以及其下任何一个子权限，是否被角色或者账号给关联着
//        RelatedCheckPriorityOperation relatedCheckOperation = context.getBean(
//                RelatedCheckPriorityOperation.class);
//        Boolean relateCheckResult = priority.execute(relatedCheckOperation);
//
//        if(relateCheckResult) {
//            return false;
//        }

        // 递归删除当前权限以及其下所有的子权限
//        RemovePriorityOperation removeOperation = context.getBean(
//                RemovePriorityOperation.class);
//        priority.execute(removeOperation);

        return true;

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
