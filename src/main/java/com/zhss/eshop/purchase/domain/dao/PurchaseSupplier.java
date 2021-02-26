package com.zhss.eshop.purchase.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 采购中心的供应商表
    */
@Data
public class PurchaseSupplier {
    /**
    * 主键
    */
    private Long id;

    /**
    * 供应商名称
    */
    private String name;

    /**
    * 公司名称
    */
    private String companyName;

    /**
    * 公司地址
    */
    private String companyAddress;

    /**
    * 联系人
    */
    private String contactor;

    /**
    * 联系电话
    */
    private String contactorPhoneNumber;

    /**
    * 账期，1：周结算，2：月结算，3：季度结算
    */
    private Byte settlementPeriod;

    /**
    * 银行名称
    */
    private String bankName;

    /**
    * 银行账户
    */
    private String bankAccount;

    /**
    * 开户人
    */
    private String bankAccountHolder;

    /**
    * 发票抬头
    */
    private String invoiceTitle;

    /**
    * 纳税人识别号
    */
    private String taxpayerId;

    /**
    * 经营范围
    */
    private String businessScope;

    /**
    * 说明备注
    */
    private String remark;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}