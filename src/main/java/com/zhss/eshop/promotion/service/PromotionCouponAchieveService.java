package com.zhss.eshop.promotion.service;

import com.zhss.eshop.promotion.domain.model.PromotionCouponAchieve;
public interface PromotionCouponAchieveService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(PromotionCouponAchieve record);

    PromotionCouponAchieve selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PromotionCouponAchieve record);

}
