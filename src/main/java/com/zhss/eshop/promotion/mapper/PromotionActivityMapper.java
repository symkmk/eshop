package com.zhss.eshop.promotion.mapper;

import com.zhss.eshop.promotion.domain.dao.PromotionActivity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PromotionActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(PromotionActivity record);

    PromotionActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PromotionActivity record);
}