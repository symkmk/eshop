package com.zhss.eshop.promotion.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.promotion.mapper.PromotionActivityMapper;
import com.zhss.eshop.promotion.domain.model.PromotionActivity;
import com.zhss.eshop.promotion.service.PromotionActivityService;
@Service
public class PromotionActivityServiceImpl implements PromotionActivityService{

    @Resource
    private PromotionActivityMapper promotionActivityMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return promotionActivityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PromotionActivity record) {
        return promotionActivityMapper.insertSelective(record);
    }

    @Override
    public PromotionActivity selectByPrimaryKey(Long id) {
        return promotionActivityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PromotionActivity record) {
        return promotionActivityMapper.updateByPrimaryKeySelective(record);
    }

}
