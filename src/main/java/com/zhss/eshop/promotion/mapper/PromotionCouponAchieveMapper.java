package com.zhss.eshop.promotion.mapper;

import com.zhss.eshop.promotion.domain.model.PromotionCouponAchieve;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PromotionCouponAchieveMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(PromotionCouponAchieve record);

    PromotionCouponAchieve selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PromotionCouponAchieve record);
}
