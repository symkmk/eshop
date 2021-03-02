package com.zhss.eshop.order.service.Impl;


import com.zhss.eshop.order.domain.dto.OrderInfoDTO;
import com.zhss.eshop.order.service.OrderInfoService;
import com.zhss.eshop.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 订单中心接口
 * @author zhonghuashishan
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderServiceImpl implements OrderService {

	private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	/**
	 * 订单管理service组件
	 */
	@Autowired
	private OrderInfoService orderInfoService;

	@Override
	public Boolean informGoodsDeliveryFinishedEvent(Long orderId) {
		return null;
	}

	@Override
	public Boolean informReturnGoodsWorksheetRejectedEvent(Long orderId) {
		return null;
	}

	@Override
	public Boolean informReturnGoodsWorsheetApprovedEvent(Long orderId) {
		return null;
	}

	@Override
	public Boolean informReturnGoodsReceivedEvent(Long orderId) {
		return null;
	}

	@Override
	public Boolean informReturnGoodsInputOrderApprovedEvent(Long orderId) {
		return null;
	}

	@Override
	public Boolean informRefundFinishedEvent(Long orderId) {
		return null;
	}

	@Override
	public Boolean informPublishCommentEvent(Long orderId) {
		try {
			OrderInfoDTO order = orderInfoService.getById(orderId);
//			order.setPublishedComment(PublishedComment.YES);
//			orderInfoService.update(order);
			return true;
		} catch (Exception e) {
			logger.error("error", e);
			return false;
		}
	}

	@Override
	public List<OrderInfoDTO> listNotPublishedCommentOrders() {
		return null;
	}

	@Override
	public Boolean informBatchPublishCommentEvent(List<Long> orderIds) {
		return null;
	}

	@Override
	public Boolean informPayOrderSuccessed(Long orderInfoId) {
		return null;
	}

	@Override
	public OrderInfoDTO getOrderById(Long orderInfoId) {
		return null;
	}
}
