package com.zhss.eshop.shopping.domain.dto;

import com.zhss.eshop.common.util.BeanCopierUtils;
import com.zhss.eshop.promotion.domain.dto.PromotionActivityDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
    * 购物车的商品条目
    */
@Data
public class ShoppingCartItemDTO {
    /**
     * id
     */
    private Long id;
    /**
     * 购物车id
     */
    private Long shoppingCartId;
    /**
     * 商品sku id
     */
    private Long goodsSkuId;
    /**
     * 商品sku编号
     */
    private String goodsSkuCode;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 销售属性
     */
    private String saleProperties;
    /**
     * 商品sku售价
     */
    private Double salePrice;
    /**
     * 商品毛重
     */
    private Double grossWeight;
    /**
     * 商品长度
     */
    private Double goodsLength;
    /**
     * 商品宽度
     */
    private Double goodsWidth;
    /**
     * 商品高度
     */
    private Double goodsHeight;
    /**
     * 商品sku的销售库存
     */
    private Long saleStockQuantity;
    /**
     * 商品id
     */
    private Long goodsId;
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

    /**
     * 促销活动集合
     */
    private List<PromotionActivityDTO> promotionActivityDTOs;

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
