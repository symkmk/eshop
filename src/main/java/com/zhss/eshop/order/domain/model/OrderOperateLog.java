package com.zhss.eshop.order.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 订单操作记录表
    */
@Data
public class OrderOperateLog {
    /**
    * 主键
    */
    private Long id;

    /**
    * 订单ID
    */
    private Long orderInfoId;

    /**
    * 操作类型，1：创建订单，2：手动取消订单，3：自动取消订单，4：支付订单，5：手动确认收货，6：自动确认收货，7：商品发货，8：申请退货，9：退货审核不通过，10：退货审核通过，11：寄送退货商品，12：确认收到退货，13：退货已入库，14：完成退款
    */
    private Byte operateType;

    /**
    * 操作内容
    */
    private String operateContent;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
