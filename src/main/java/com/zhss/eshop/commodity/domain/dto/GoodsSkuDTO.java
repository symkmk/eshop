package com.zhss.eshop.commodity.domain.dto;

import lombok.Data;

import java.util.Date;

/**
    * 商品sku信息
    */
@Data
public class GoodsSkuDTO {
    /**
     * id
     */
    private Long id;
    /**
     * 商品id
     */
    private Long goodsId;
    /**
     * 商品sku编号
     */
    private String skuCode;
    /**
     * 商品名称
     */
    private String goodsName;
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
     * 商品sku编号
     */
    private String goodsSkuCode;
    /**
     * 销售属性
     */
    private String saleProperties;
    /**
     * 采购价格
     */
    private Double purchasePrice;
    /**
     * 销售价格
     */
    private Double salePrice;
    /**
     * 折扣价格
     */
    private Double discountPrice;
    /**
     * 销售库存
     */
    private Long saleStockQuantity;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改文件
     */
    private Date gmtModified;
}
