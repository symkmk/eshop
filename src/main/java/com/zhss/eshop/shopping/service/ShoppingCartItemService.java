package com.zhss.eshop.shopping.service;

import com.zhss.eshop.shopping.domain.model.ShoppingCartItem;
public interface ShoppingCartItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(ShoppingCartItem record);

    ShoppingCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingCartItem record);

    /**
     * 更新购物车条目的购买数量
     * @param id 购物车条目id
     * @param purchaseQuantity 购买数量
     * @return 处理结果
     * @throws Exception
     */
    void updatePurchaseQuantity(Long id, Long purchaseQuantity) throws Exception;
}
