package com.zhss.eshop.promotion.mapper;

import com.zhss.eshop.promotion.domain.model.PromotionCoupon;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PromotionCouponMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(PromotionCoupon record);

    PromotionCoupon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PromotionCoupon record);
}
