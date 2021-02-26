package com.zhss.eshop.promotion.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.promotion.mapper.PromotionCouponAchieveMapper;
import com.zhss.eshop.promotion.domain.dao.PromotionCouponAchieve;
import com.zhss.eshop.promotion.service.PromotionCouponAchieveService;
@Service
public class PromotionCouponAchieveServiceImpl implements PromotionCouponAchieveService{

    @Resource
    private PromotionCouponAchieveMapper promotionCouponAchieveMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return promotionCouponAchieveMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PromotionCouponAchieve record) {
        return promotionCouponAchieveMapper.insertSelective(record);
    }

    @Override
    public PromotionCouponAchieve selectByPrimaryKey(Long id) {
        return promotionCouponAchieveMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PromotionCouponAchieve record) {
        return promotionCouponAchieveMapper.updateByPrimaryKeySelective(record);
    }

}
