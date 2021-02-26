package com.zhss.eshop.pay.domain.dao;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 支付交易流水
    */
@Data
public class PayTransaction {
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
    * 订单总金额
    */
    private BigDecimal payableAmount;

    /**
    * 用户账号ID
    */
    private Long userAccountId;

    /**
    * 用户支付账号
    */
    private String userPayAccount;

    /**
    * 交易渠道，1：支付宝，2：微信
    */
    private Byte transactionChannel;

    /**
    * 交易流水号，第三方支付平台生成
    */
    private String transactionNumber;

    /**
    * 第三方平台完成支付的时间
    */
    private Date finishPayTime;

    /**
    * 交易渠道返回的状态码
    */
    private String responseCode;

    /**
    * 支付状态，1：待支付，2：支付成功，3：支付失败，4：交易关闭；5：退款
    */
    private String status;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}