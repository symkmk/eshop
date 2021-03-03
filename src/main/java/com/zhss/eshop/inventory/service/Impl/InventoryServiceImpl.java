package com.zhss.eshop.inventory.service.Impl;

import com.zhss.eshop.inventory.service.InventoryService;
import com.zhss.eshop.order.domain.dto.OrderInfoDTO;
import com.zhss.eshop.wms.domain.dto.PurchaseInputOrderDTO;
import com.zhss.eshop.wms.domain.dto.ReturnGoodsInputOrderDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 库存中心对外接口service组件
 * @author zhonghuashishan
 *
 */
@Service
public class InventoryServiceImpl implements InventoryService {

	private static final Logger logger = LoggerFactory.getLogger(InventoryServiceImpl.class);


	@Override
	public Boolean informPurchaseInputFinished(PurchaseInputOrderDTO purchaseInputOrderDTO) {
		return null;
	}

	@Override
	public Boolean informSubmitOrderEvent(OrderInfoDTO orderDTO) {
		return null;
	}

	@Override
	public Boolean informPayOrderEvent(OrderInfoDTO orderDTO) {
		return null;
	}

	@Override
	public Boolean informCancelOrderEvent(OrderInfoDTO orderDTO) {
		return null;
	}

	@Override
	public Boolean informReturnGoodsInputFinished(ReturnGoodsInputOrderDTO returnGoodsInputOrderDTO) {
		return null;
	}

	@Override
	public Long getSaleStockQuantity(Long goodsSkuId) {
		return null;
	}

	@Override
	public Boolean setSaleStockQuantity(Long goodsSkuId, Long saleStockQuantity) {
		return null;
	}
}
