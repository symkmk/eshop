package com.zhss.eshop.shopping.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 购物车的商品条目
    */
@Data
public class ShoppingCartItem {
    /**
    * 主键
    */
    private Long id;

    /**
    * 购物车ID
    */
    private Long shoppingCartId;

    /**
    * 商品sku ID
    */
    private Long goodsSkuId;

    /**
    * 购买数量
    */
    private Long purchaseQuantity;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
