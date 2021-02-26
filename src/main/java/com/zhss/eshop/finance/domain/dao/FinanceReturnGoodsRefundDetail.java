package com.zhss.eshop.finance.domain.dao;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 财务中心：退货打款流水明细
    */
@Data
public class FinanceReturnGoodsRefundDetail {
    /**
    * 主键
    */
    private Long id;

    /**
    * 订单ID
    */
    private Long orderId;

    /**
    * 订单编号
    */
    private String orderNo;

    /**
    * 退货工单ID
    */
    private Long returnGoodsWorksheetId;

    /**
    * 退货入库单ID
    */
    private Long returnGoodsWarehouseEntryOrderId;

    /**
    * 用户账号ID
    */
    private Long userAccountId;

    /**
    * 退款金额
    */
    private BigDecimal refundlAmount;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}