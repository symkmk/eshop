package com.zhss.eshop.promotion.service;

import com.zhss.eshop.promotion.domain.model.PromotionCoupon;
public interface PromotionCouponService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(PromotionCoupon record);

    PromotionCoupon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PromotionCoupon record);

}
