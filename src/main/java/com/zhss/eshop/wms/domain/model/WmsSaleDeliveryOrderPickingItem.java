package com.zhss.eshop.wms.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 销售出库单的拣货条目
    */
@Data
public class WmsSaleDeliveryOrderPickingItem {
    /**
    * 主键
    */
    private Long id;

    /**
    * 销售出库单条目ID
    */
    private Long saleDeliveryOrderItemId;

    /**
    * 货位ID
    */
    private Long goodsAllocationId;

    /**
    * 商品sku id
    */
    private Long goodsSkuId;

    /**
    * 发多少件商品
    */
    private Long pickingCount;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
