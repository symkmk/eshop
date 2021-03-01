package com.zhss.eshop.auth.controller;


import com.zhss.eshop.auth.domain.dto.PriorityDTO;
import com.zhss.eshop.auth.domain.model.AuthPriority;
import com.zhss.eshop.auth.domain.vo.PriorityVO;
import com.zhss.eshop.auth.service.AuthPriorityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 权限管理模块的controller组件
 *
 * @author suyuan
 */
@RestController
@RequestMapping("/auth/priority")
public class PriorityController {

    private static final Logger logger = LoggerFactory.getLogger(PriorityController.class);

    /**
     * 权限管理模块的service组件
     */
    @Autowired
    private AuthPriorityService priorityService;


    /**
     * 查询根权限
     *
     * @return 根权限集合
     */
    @GetMapping("/root")
    public List<PriorityVO> listRootPriorities() {
        try {
            List<PriorityDTO> priorityDTOs = priorityService.listRootPriorities();
            if (priorityDTOs == null) {
                priorityDTOs = new ArrayList<PriorityDTO>();
            }
            //传入初始大小
            List<PriorityVO> priorityVOs = new ArrayList<PriorityVO>(priorityDTOs.size());
            //要拷贝数据使用原型模式复制
            //DO->DTO
            //DTO->VO
//			for(PriorityDTO priorityDTO : priorityDTOs) {
//				priorityVOs.add(convertPriorityDTO2VO(priorityDTO));
//			}
            for (PriorityDTO priorityDTO : priorityDTOs) {
                priorityVOs.add(priorityDTO.clone(PriorityVO.class));
            }

            return priorityVOs;
        } catch (Exception e) {
            logger.error("error", e);
        }
        return new ArrayList<PriorityVO>();
    }

    /**
     * 根据父权限id查询子权限
     *
     * @param parentId 父权限id
     * @return 子权限
     */
    @GetMapping("/child/{parentId}")
    public List<PriorityVO> listChildPriorities(
            @PathVariable("parentId") Long parentId) {
        try {
            List<PriorityDTO> priorityDTOs = priorityService.listChildPriorities(parentId);
            if (priorityDTOs == null) {
                priorityDTOs = new ArrayList<PriorityDTO>();
            }

            List<PriorityVO> priorityVOs = new ArrayList<PriorityVO>(priorityDTOs.size());
//			for(PriorityDTO priorityDTO : priorityDTOs) {
//				priorityVOs.add(convertPriorityDTO2VO(priorityDTO));
//			}
            for (PriorityDTO priorityDTO : priorityDTOs) {
                priorityVOs.add(priorityDTO.clone(PriorityVO.class));
            }

            return priorityVOs;
        } catch (Exception e) {
            logger.error("error", e);
        }
        return new ArrayList<PriorityVO>();
    }

    /**
     * 新增权限
     */
    @PostMapping("/")
    public Boolean savePriority(@RequestBody PriorityVO priorityVO) {
        try {
//			priorityService.insertSelective(convertPriorityVO2DTO(priorityVO));
            priorityService.insertSelective(priorityVO.clone(PriorityDTO.class));
        } catch (Exception e) {
            logger.error("error", e);
            return false;
        }
        return true;
    }

    /**
     * 更新权限
     */
    @PutMapping("/{id}")
    public Boolean updatePriority(@RequestBody PriorityVO priorityVO) {
        try {
            priorityService.updateByPrimaryKeySelective(priorityVO.clone(PriorityDTO.class));
        } catch (Exception e) {
            logger.error("error", e);
            return false;
        }
        return true;
    }

    /**
     * 删除权限
     */
    @DeleteMapping("/{id}")
    public Boolean removePriority(@PathVariable("id") Long id) {
        try {
            return priorityService.deleteByPrimaryKey(id);
        } catch (Exception e) {
            logger.error("error", e);
        }
        return false;
    }

}
