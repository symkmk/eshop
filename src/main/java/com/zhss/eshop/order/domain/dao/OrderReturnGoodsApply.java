package com.zhss.eshop.order.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 订单退货表
    */
@Data
public class OrderReturnGoodsApply {
    /**
    * 主键
    */
    private Long id;

    /**
    * 订单ID
    */
    private Long orderInfoId;

    /**
    * 退货原因，1：质量不好，2：商品不满意，3：买错了，4：无理由退货
    */
    private Byte returnGoodsReason;

    /**
    * 退货备注
    */
    private String returnGoodsComment;

    /**
    * 退货记录状态，1：待审核，2：审核不通过，3：审核通过
    */
    private Byte returnGoodsApplyStatus;

    /**
    * 退货快递单号
    */
    private String returnGoodsLogisticCode;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}