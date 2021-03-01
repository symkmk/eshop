package com.zhss.eshop.auth.service;

import com.zhss.eshop.auth.domain.dto.PriorityDTO;
import com.zhss.eshop.auth.domain.model.AuthPriority;


import java.util.List;

public interface AuthPriorityService{


    Boolean deleteByPrimaryKey(Long id) throws Exception;

    int insertSelective(PriorityDTO record) throws Exception;

    PriorityDTO selectByPrimaryKey(Long id) throws Exception;

    int updateByPrimaryKeySelective(PriorityDTO record) throws Exception;

    List<PriorityDTO> listRootPriorities() throws Exception;

    List<PriorityDTO> listChildPriorities( Long parentId) throws Exception;

}
