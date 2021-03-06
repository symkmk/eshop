package com.zhss.eshop.wms.domain.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * wms中心的销售出库单
    */
@Data
public class WmsSaleDeliveryOrder {
    /**
    * 主键
    */
    private Long id;

    /**
    * 订单ID
    */
    private Long orderId;

    /**
    * 订单编号，随机生成的UUID
    */
    private String orderNo;

    /**
    * 用户账号ID
    */
    private String userAccountId;

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
    * 销售出库单的状态，1：编辑中，2：待审核，3：已完成
    */
    private Byte status;

    /**
    * 发货时间
    */
    private Date deliveryTime;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
