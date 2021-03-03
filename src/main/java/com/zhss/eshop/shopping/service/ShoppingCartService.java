package com.zhss.eshop.shopping.service;

import com.zhss.eshop.shopping.domain.dto.ShoppingCartDTO;
import com.zhss.eshop.shopping.domain.model.ShoppingCart;
public interface ShoppingCartService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingCart record);

    /**
     * 添加购物车商品条目
     * @param userAccountId 用户账号id
     * @param goodsSkuId 商品sku id
     * @return 处理结果
     * @throws Exception
     */
    void addShoppingCartItem(Long userAccountId, Long goodsSkuId) throws Exception;

    /**
     * 查看用户的购物车中的数据
     * @param userAccountId 用户账号id
     * @return 购物车DTO对象
     * @throws Exception
     */
    ShoppingCartDTO getShoppingCartDTOByUserAccountId(Long userAccountId) throws Exception;

}
