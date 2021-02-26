package com.zhss.eshop.shopping.mapper;

import com.zhss.eshop.shopping.domain.dao.ShoppingCartItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShoppingCartItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(ShoppingCartItem record);

    ShoppingCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingCartItem record);
}