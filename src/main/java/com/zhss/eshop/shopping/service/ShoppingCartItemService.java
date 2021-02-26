package com.zhss.eshop.shopping.service;

import com.zhss.eshop.shopping.domain.model.ShoppingCartItem;
public interface ShoppingCartItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(ShoppingCartItem record);

    ShoppingCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingCartItem record);

}
