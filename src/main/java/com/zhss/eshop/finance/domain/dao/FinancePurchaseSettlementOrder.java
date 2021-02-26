package com.zhss.eshop.finance.domain.dao;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 财务中心的采购结算单
    */
@Data
public class FinancePurchaseSettlementOrder {
    /**
    * 主键
    */
    private Long id;

    /**
    * 采购单id
    */
    private Long purchaseOrderId;

    /**
    * 采购入库单id
    */
    private Long purchaseInputOrderId;

    /**
    * 供应商ID
    */
    private Long supplierId;

    /**
    * 预计到货时间
    */
    private Date expectArrivalTime;

    /**
    * 实际到货时间
    */
    private Date actualArrivalTime;

    /**
    * 采购联系人
    */
    private String purchaseContactor;

    /**
    * 采购联系电话
    */
    private String purchaseContactorPhoneNumber;

    /**
    * 采购联系邮箱
    */
    private String purchaseContactorEmail;

    /**
    * 采购单备注说明
    */
    private String purchaseOrderRemark;

    /**
    * 采购员
    */
    private String purchaser;

    /**
    * 采购入库单状态，1：编辑中，2：待审核，3：已完成
    */
    private Byte status;

    /**
    * 总结算金额
    */
    private BigDecimal totalSettlementAmount;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}