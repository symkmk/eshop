package com.zhss.eshop.wms.domain.dao;

import java.util.Date;
import lombok.Data;

@Data
public class WmsSaleDeliveryOrderSendOutDetail {
    /**
    * 主键
    */
    private Long id;

    /**
    * 销售出库单条目id
    */
    private Long saleDeliveryOrderItemId;

    /**
    * 货位库存明细id
    */
    private Long goodsAllocationStockDetailId;

    /**
    * 发货数量
    */
    private Long sendOutCount;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 修改时间
    */
    private Date gmtModified;
}