package com.zhss.eshop.promotion.mapper;

import com.zhss.eshop.promotion.domain.dao.PromotionActivityGoodsRelation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PromotionActivityGoodsRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(PromotionActivityGoodsRelation record);

    PromotionActivityGoodsRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PromotionActivityGoodsRelation record);
}