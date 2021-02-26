package com.zhss.eshop.membership.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 会员中心的收货地址表
    */
@Data
public class MembershipDeliveryAddress {
    /**
    * 主键
    */
    private Long id;

    /**
    * 属于哪个用户账号
    */
    private Long userAccountId;

    /**
    * 省
    */
    private String province;

    /**
    * 市
    */
    private String city;

    /**
    * 区
    */
    private String district;

    /**
    * 收货人
    */
    private String consignee;

    /**
    * 收货地址
    */
    private String address;

    /**
    * 收货人电话号码
    */
    private String phoneNumber;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
