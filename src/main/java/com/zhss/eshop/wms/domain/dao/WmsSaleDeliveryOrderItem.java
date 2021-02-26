package com.zhss.eshop.wms.domain.dao;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * wms中心的销售出库单条目
    */
@Data
public class WmsSaleDeliveryOrderItem {
    /**
    * 主键
    */
    private Long id;

    /**
    * 销售出库单ID
    */
    private Long saleDeliveryOrderId;

    /**
    * 商品sku ID
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
    * 销售属性，机身颜色:白色,内存容量:256G
    */
    private String saleProperties;

    /**
    * 商品毛重
    */
    private BigDecimal goodsGrossWeight;

    /**
    * 购买数量
    */
    private Long purchaseQuantity;

    /**
    * 商品购买价格
    */
    private BigDecimal purchasePrice;

    /**
    * 促销活动ID
    */
    private Long promotionActivityId;

    /**
    * 商品长度
    */
    private BigDecimal goodsLength;

    /**
    * 商品宽度
    */
    private BigDecimal goodsWidth;

    /**
    * 商品高度
    */
    private BigDecimal goodsHeight;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}