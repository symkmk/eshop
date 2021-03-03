package com.zhss.eshop.shopping.mapper;

import com.zhss.eshop.shopping.domain.model.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShoppingCartMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingCart record);

    /**
     * 根据用户账号id查询购物车
     * @param userAccountId 用户账号id
     * @return 购物车
     */
    ShoppingCart getShoppingCartByUserAccountId(
            @Param("userAccountId") Long userAccountId);
}
