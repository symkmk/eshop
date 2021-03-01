package com.zhss.eshop.auth.service.Impl;


import com.zhss.eshop.auth.domain.model.AuthPriority;
import com.zhss.eshop.auth.mapper.AuthAccountPriorityRelationshipMapper;
import com.zhss.eshop.auth.mapper.AuthPriorityMapper;
import com.zhss.eshop.auth.mapper.AuthRolePriorityRelationshipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 检查权限是否被关联的操作
 * @author zhonghuashishan
 *
 */

public class RelatedCheckPriorityOperation implements PriorityOperation {

	/**
	 * 关联检查结果
	 */
	private Boolean relateCheckResult = false;
	/**
	 * 权限管理模块的DAO组件
	 */

	private AuthPriorityMapper priorityDAO;
	/**
	 * 角色和权限关系管理模块的DAO组件
	 */

	private AuthRolePriorityRelationshipMapper rolePriorityRelationshipDAO;
	/**
	 * 账号和权限关系管理模块的DAO组件
	 */

	private AuthAccountPriorityRelationshipMapper accountPriorityRelationshipDAO;

	/**
	 * 构造函数:现在不能用@Autowired自动注入
	 * @author suyuan
	 * @date 2021/3/1 11:31
	 */
	public RelatedCheckPriorityOperation(AuthPriorityMapper priorityDAO, AuthRolePriorityRelationshipMapper rolePriorityRelationshipDAO, AuthAccountPriorityRelationshipMapper accountPriorityRelationshipDAO) {
		this.priorityDAO = priorityDAO;
		this.rolePriorityRelationshipDAO = rolePriorityRelationshipDAO;
		this.accountPriorityRelationshipDAO = accountPriorityRelationshipDAO;
	}

	/**
	 * 访问权限树节点
	 * @author suyuan
	 * @date 2021/3/1 10:00
	 */
	@Override
	public Boolean visit(PriorityNode priority) throws Exception {
		List<AuthPriority> priorityDOs = priorityDAO.listChildPriorities(priority.getId());
		if(priorityDOs != null && priorityDOs.size() > 0) {
			for(AuthPriority priorityDO : priorityDOs) {
				//将DO的数据克隆给Priority
				PriorityNode priorityNode = priorityDO.clone(PriorityNode.class);
				priorityNode.accept(this);
			}
		}

		if(relateCheck(priority)) {
			this.relateCheckResult = true;
		}

		return this.relateCheckResult;
	}

	/**
	 * 检查权限是否被任何一个角色或者是账号关联了
	 * @param node 权限树节点
	 * @return 是否被任何一个角色或者是账号关联了，如果有关联则为true；如果没有关联则为false
	 */
	private Boolean relateCheck(PriorityNode node) throws Exception {
		Long roleRelatedCount = rolePriorityRelationshipDAO
				.countByPriorityId(node.getId());
		if(roleRelatedCount != null && roleRelatedCount > 0) {
			return true;
		}

		Long accountRelatedCount = accountPriorityRelationshipDAO
				.countByPriorityId(node.getId());
		if(accountRelatedCount != null && accountRelatedCount > 0) {
			return true;
		}

		return false;
	}

	public Boolean getRelateCheckResult() {
		return relateCheckResult;
	}

}
