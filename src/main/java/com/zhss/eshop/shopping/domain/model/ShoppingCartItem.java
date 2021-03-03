package com.zhss.eshop.shopping.domain.model;

import com.zhss.eshop.common.util.BeanCopierUtils;
import lombok.Data;

import java.util.Date;

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

    //克隆
    public <T> T clone(Class<T> clazz) throws Exception {
        T target=null;
        try {
            target=clazz.newInstance();
        }catch (Exception exception){
//            logger.error("克隆对象出错");
        }
        BeanCopierUtils.copyProperties(this, target);
        return target;

    }
}
