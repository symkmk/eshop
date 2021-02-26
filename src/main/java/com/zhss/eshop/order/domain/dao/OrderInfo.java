package com.zhss.eshop.order.domain.dao;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 订单信息表
    */
@Data
public class OrderInfo {
    /**
    * 主键
    */
    private Long id;

    /**
    * 用户账号ID
    */
    private Long userAccountId;

    /**
    * 用户名
    */
    private String username;

    /**
    * 订单编号，随机生成的UUID
    */
    private String orderNo;

    /**
    * 订单状态，1：待付款，2：已取消，3：待发货，4：待收货，5：已完成，6：售后中（退货申请待审核），7：交易关闭（退货审核不通过），8：交易中（待寄送退货商品），9：售后中（退货商品待收货），10：售后中（退货待入库），11：（1）售后中（退货已入库），12：交易关闭（完成退款）
    */
    private Byte orderStatus;

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
    * 是否发表评论，1：发表，0：未发表
    */
    private Byte isPublishedComment;

    /**
    * 确认收货时间
    */
    private Date confirmReceiptTime;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}