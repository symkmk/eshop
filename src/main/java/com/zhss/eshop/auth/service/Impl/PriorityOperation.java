package com.zhss.eshop.auth.service.Impl;

/**
 * 权限操作接口
 * @author zhonghuashishan
 *
 */
public interface PriorityOperation {

	/**
	 * 执行这个操作
	 * @param priority 权限
	 * @return 处理结果
	 * @throws Exception
	 */
	Boolean visit(PriorityNode priority) throws Exception;

}
