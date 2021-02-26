package com.zhss.eshop.shopping.mapper;

import com.zhss.eshop.shopping.domain.dao.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShoppingCartMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingCart record);
}