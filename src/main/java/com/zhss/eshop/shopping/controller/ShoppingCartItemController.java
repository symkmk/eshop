package com.zhss.eshop.shopping.controller;


import com.zhss.eshop.shopping.service.ShoppingCartItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 购物车条目管理controller组件
 * @author zhonghuashishan
 *
 */
@RestController
@RequestMapping("/cart/item")
public class ShoppingCartItemController {

	private static final Logger logger = LoggerFactory.getLogger(ShoppingCartItemController.class);

	/**
	 * 购物车条目管理service组件
	 */
	@Autowired
	private ShoppingCartItemService shoppingCartItemService;

	/**
	 * 更新购物车条目的购买数量
	 * @param id 购物车条目id
	 * @param purchaseQuantity 购买数量
	 * @return 处理结果
	 */
	@PutMapping("/{id}")
	public Boolean updatePurchaseQuantity(@PathVariable("id") Long id,
			Long purchaseQuantity) {
		try {
			shoppingCartItemService.updatePurchaseQuantity(id, purchaseQuantity);
			return true;
		} catch (Exception e) {
			logger.error("error", e);
			return false;
		}
	}

	/**
	 * 删除购物车条目
	 * @param id 购物车条目id
	 * @return 处理结果
	 */
	@DeleteMapping("/{id}")
	public Boolean remove(@PathVariable("id") Long id) {
		try {
			shoppingCartItemService.deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			logger.error("error", e);
			return false;
		}
	}
}
