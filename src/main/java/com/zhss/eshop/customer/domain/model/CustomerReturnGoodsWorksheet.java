package com.zhss.eshop.customer.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 客服中心的退货工单
    */
@Data
public class CustomerReturnGoodsWorksheet {
    /**
    * 主键
    */
    private Long id;

    /**
    * 订单ID
    */
    private Long orderInfoId;

    /**
    * 订单编号
    */
    private String orderNo;

    /**
    * 退货工单状态，1：待审核，2：审核不通过，3：待寄送退货商品，4：退货商品待收货，5：退货待入库，6：退货已入库，7：完成退款
    */
    private Byte status;

    /**
    * 退货原因，1：质量不好，2：商品不满意，3：买错了，4：无理由退货
    */
    private Byte returnGoodsReason;

    /**
    * 退货备注
    */
    private String returnGoodsRemark;

    /**
    * 退货快递单号
    */
    private String returnGoodsLogisticsCode;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
