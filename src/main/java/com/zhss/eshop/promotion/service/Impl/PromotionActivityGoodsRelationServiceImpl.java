package com.zhss.eshop.promotion.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.promotion.domain.model.PromotionActivityGoodsRelation;
import com.zhss.eshop.promotion.mapper.PromotionActivityGoodsRelationMapper;
import com.zhss.eshop.promotion.service.PromotionActivityGoodsRelationService;
@Service
public class PromotionActivityGoodsRelationServiceImpl implements PromotionActivityGoodsRelationService{

    @Resource
    private PromotionActivityGoodsRelationMapper promotionActivityGoodsRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return promotionActivityGoodsRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PromotionActivityGoodsRelation record) {
        return promotionActivityGoodsRelationMapper.insertSelective(record);
    }

    @Override
    public PromotionActivityGoodsRelation selectByPrimaryKey(Long id) {
        return promotionActivityGoodsRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PromotionActivityGoodsRelation record) {
        return promotionActivityGoodsRelationMapper.updateByPrimaryKeySelective(record);
    }

}
