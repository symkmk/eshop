package com.zhss.eshop.finance.domain.dao;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 财务中心：跟物流公司的结算流水明细
    */
@Data
public class FinanceLogisticsSettlementDetail {
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
    * 结算金额
    */
    private BigDecimal totalSettlementAmount;

    /**
    * 银行账号
    */
    private String bankAccount;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}