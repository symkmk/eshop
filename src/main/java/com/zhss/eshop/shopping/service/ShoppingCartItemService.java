package com.zhss.eshop.shopping.service;

import com.zhss.eshop.shopping.domain.dao.ShoppingCartItem;
public interface ShoppingCartItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(ShoppingCartItem record);

    ShoppingCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingCartItem record);

}
