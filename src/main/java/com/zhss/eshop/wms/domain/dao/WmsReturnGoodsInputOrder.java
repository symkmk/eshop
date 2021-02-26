package com.zhss.eshop.wms.domain.dao;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * wms中心的退货入库单
    */
@Data
public class WmsReturnGoodsInputOrder {
    /**
    * 主键
    */
    private Long id;

    /**
    * 退货工单id
    */
    private Long returnGoodsWorksheetId;

    /**
    * 用户账号ID
    */
    private String userAccountId;

    /**
    * 订单ID
    */
    private Long orderId;

    /**
    * 订单编号，随机生成的UUID
    */
    private String orderNo;

    /**
    * 退货入库单状态，1：编辑中，2：待审核：3：已完成
    */
    private Byte status;

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
    * 退货原因，1：质量不好，2：商品不满意，3：买错了，4：无理由退货
    */
    private Byte returnGoodsReason;

    /**
    * 退货备注
    */
    private String returnGoodsRemark;

    /**
    * 到货时间
    */
    private Date arrivalTime;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}