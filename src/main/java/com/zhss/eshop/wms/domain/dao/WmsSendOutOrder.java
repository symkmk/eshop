package com.zhss.eshop.wms.domain.dao;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 订单信息表
    */
@Data
public class WmsSendOutOrder {
    /**
    * 主键
    */
    private Long id;

    /**
    * 销售出库单id
    */
    private Long saleDeliveryOrderId;

    /**
    * 用户账号ID
    */
    private Long userAccountId;

    /**
    * 用户名
    */
    private String username;

    /**
    * 订单id
    */
    private Long orderId;

    /**
    * 订单编号，随机生成的UUID
    */
    private String orderNo;

    /**
    * 收货人
    */
    private String consignee;

    /**
    * 收货地址
    */
    private String deliveryAddress;

    /**
    * 收货人电话号码
    */
    private String consigneeCellPhoneNumber;

    /**
    * 运费
    */
    private BigDecimal freight;

    /**
    * 支付方式，1：支付宝，2：微信
    */
    private Byte payType;

    /**
    * 订单总金额
    */
    private BigDecimal totalAmount;

    /**
    * 促销活动折扣金额
    */
    private BigDecimal discountAmount;

    /**
    * 优惠券抵扣金额
    */
    private BigDecimal couponAmount;

    /**
    * 应付金额，订单总金额 - 促销活动折扣金额 - 优惠券抵扣金额 + 运费
    */
    private BigDecimal payableAmount;

    /**
    * 发票抬头
    */
    private String invoiceTitle;

    /**
    * 纳税人识别号
    */
    private String taxpayerId;

    /**
    * 订单备注
    */
    private String orderComment;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}