package com.zhss.eshop.shopping.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 购物车
    */
@Data
public class ShoppingCart {
    /**
    * 主键
    */
    private Long id;

    /**
    * 会员账号ID
    */
    private Long userAccountId;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}