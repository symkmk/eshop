package com.zhss.eshop.promotion.service;

import com.zhss.eshop.promotion.domain.model.PromotionActivity;
public interface PromotionActivityService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(PromotionActivity record);

    PromotionActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PromotionActivity record);

}
