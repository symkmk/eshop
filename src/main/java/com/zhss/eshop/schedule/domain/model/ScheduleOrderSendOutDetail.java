package com.zhss.eshop.schedule.domain.model;

import java.util.Date;
import lombok.Data;

@Data
public class ScheduleOrderSendOutDetail {
    /**
    * 主键
    */
    private Long id;

    /**
    * 订单id
    */
    private Long orderInfoId;

    /**
    * 订单条目id
    */
    private Long orderItemId;

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
