package com.zhss.eshop.wms.domain.dao;

import java.util.Date;
import lombok.Data;

@Data
public class WmsLogisticOrder {
    /**
    * 主键
    */
    private Long id;

    /**
    * 销售出库单id
    */
    private Long saleDeliveryOrderId;

    /**
    * 物流单号
    */
    private String logisticCode;

    /**
    * 物流单内容
    */
    private String content;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 修改时间
    */
    private Date gmtModified;
}