package com.zhss.eshop.wms.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 采购入库单条目关联的上架条目
    */
@Data
public class WmsPurchaseInputOrderPutOnItem {
    /**
    * 主键
    */
    private Long id;

    /**
    * 采购入库单条目ID
    */
    private Long purchaseInputOrderItemId;

    /**
    * 货位ID
    */
    private Long goodsAllocationId;

    /**
    * 商品sku id
    */
    private Long goodsSkuId;

    /**
    * 上架数量
    */
    private Long putOnShelvesCount;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}