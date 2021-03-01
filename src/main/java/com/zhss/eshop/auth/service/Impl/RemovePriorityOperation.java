package com.zhss.eshop.auth.service.Impl;


import com.zhss.eshop.auth.domain.model.AuthPriority;
import com.zhss.eshop.auth.mapper.AuthPriorityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 删除权限操作
 * @author zhonghuashishan
 *
 */

public class RemovePriorityOperation implements PriorityOperation {

	/**
	 * 权限管理模块的DAO组件
	 */
	private AuthPriorityMapper priorityDAO;

	public RemovePriorityOperation(AuthPriorityMapper priorityDAO) {
		this.priorityDAO = priorityDAO;
	}

	/**
	 * 访问权限树节点
	 * @param node 权限树节点
	 */
	@Override
	public Boolean visit(PriorityNode node) throws Exception {
		List<AuthPriority> priorityDOs = priorityDAO
				.listChildPriorities(node.getId());

		if(priorityDOs != null && priorityDOs.size() > 0) {
			for(AuthPriority priorityDO : priorityDOs) {
				PriorityNode priorityNode = priorityDO.clone(PriorityNode.class);
				//递归
				priorityNode.accept(this);
			}
		}

		removePriority(node);

		return true;
	}

	/**
	 * 删除权限
	 * @param node 权限树节点
	 */
	private void removePriority(PriorityNode node) throws Exception {
		priorityDAO.deleteByPrimaryKey(node.getId());
	}

}
