package com.zhss.eshop.shopping.domain.model;

import com.zhss.eshop.common.util.BeanCopierUtils;
import lombok.Data;

import java.util.Date;

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

    //克隆
    public <T> T clone(Class<T> clazz) throws Exception {
        T target=null;
        try {
            target=clazz.newInstance();
        }catch (Exception exception){
//            logger.error("克隆对象出错");
        }
        BeanCopierUtils.copyProperties(this, target);
        return target;

    }
}
