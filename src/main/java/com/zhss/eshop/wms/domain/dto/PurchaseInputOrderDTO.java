package com.zhss.eshop.wms.domain.dto;

import lombok.Data;

import java.util.Date;

/**
    * wms中心的采购入库单
    */
@Data
public class PurchaseInputOrderDTO {
    /**
    * 主键
    */
    private Long id;

    /**
    * 采购单id
    */
    private Long purchaseOrderId;

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
    * 采购单的说明备注
    */
    private String purchaseOrderRemark;

    /**
    * 采购员
    */
    private String purchaser;

    /**
    * 采购入库单状态，1：编辑中，2：待审核，3：已入库，4：待结算，5：已完成
    */
    private Byte status;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
