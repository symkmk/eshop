package com.zhss.eshop.shopping.mapper;

import com.zhss.eshop.shopping.domain.model.ShoppingCartItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShoppingCartItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(ShoppingCartItem record);

    ShoppingCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingCartItem record);

    /**
     * 根据商品sku id查询购物车中是否存在商品条目
     * @param shoppingCartId 购物车id
     * @param goodsSkuId 商品sku id
     * @return 商品条目
     */
    ShoppingCartItem getShoppingCartItemByGoodsSkuId(
            @Param("shoppingCartId") Long shoppingCartId,
            @Param("goodsSkuId") Long goodsSkuId);

    List<ShoppingCartItem> listShoppingCartItemByCartId(
            @Param("shoppingCartId") Long shoppingCartId);

}
