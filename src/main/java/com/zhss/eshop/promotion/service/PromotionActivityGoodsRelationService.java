package com.zhss.eshop.promotion.service;

import com.zhss.eshop.promotion.domain.model.PromotionActivityGoodsRelation;
public interface PromotionActivityGoodsRelationService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(PromotionActivityGoodsRelation record);

    PromotionActivityGoodsRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PromotionActivityGoodsRelation record);

}
