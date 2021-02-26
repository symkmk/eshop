package com.zhss.eshop.purchase.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 采购中心的采购单
    */
@Data
public class PurchaseOrder {
    /**
    * 主键
    */
    private Long id;

    /**
    * 供应商ID
    */
    private Long supplierId;

    /**
    * 预计到货时间
    */
    private Date expectArrivalTime;

    /**
    * 联系人
    */
    private String contactor;

    /**
    * 联系电话
    */
    private String contactorPhoneNumber;

    /**
    * 联系邮箱
    */
    private String contactorEmail;

    /**
    * 说明备注
    */
    private String remark;

    /**
    * 采购员
    */
    private String purchaser;

    /**
    * 采购单状态，1：编辑中，2：待审核，3：已审核，4：待入库，5：待结算，6：已完成
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
