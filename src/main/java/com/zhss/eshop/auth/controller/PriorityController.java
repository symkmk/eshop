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
 * @author suyuan
 *
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
	 * @return 根权限集合
	 */
	@GetMapping("/root")
	public List<PriorityVO> listRootPriorities() {
		try {
			List<PriorityDTO> priorityDTOs = priorityService.listRootPriorities();
			if(priorityDTOs == null) {
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
			for(PriorityDTO priorityDTO : priorityDTOs) {
				priorityVOs.add(priorityDTO.clone(PriorityVO.class));
			}

			return priorityVOs;
		} catch (Exception e) {
			logger.error("error", e);
		}
		return new ArrayList<PriorityVO>();
	}



}
