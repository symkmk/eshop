package com.zhss.eshop.schedule.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 调度后的订单条目对应的拣货条目
    */
@Data
public class ScheduleOrderPickingItem {
    /**
    * 主键
    */
    private Long id;

    /**
    * 定案id
    */
    private Long orderInfoId;

    /**
    * 订单条目ID
    */
    private Long orderItemId;

    /**
    * 货位ID
    */
    private Long goodsAllocationId;

    /**
    * 商品sku id
    */
    private Long goodsSkuId;

    /**
    * 拣货数量
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