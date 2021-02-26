package com.zhss.eshop.shopping.service;

import com.zhss.eshop.shopping.domain.dao.ShoppingCart;
public interface ShoppingCartService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingCart record);

}
