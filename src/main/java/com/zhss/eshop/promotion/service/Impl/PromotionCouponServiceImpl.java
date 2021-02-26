package com.zhss.eshop.promotion.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.promotion.domain.dao.PromotionCoupon;
import com.zhss.eshop.promotion.mapper.PromotionCouponMapper;
import com.zhss.eshop.promotion.service.PromotionCouponService;
@Service
public class PromotionCouponServiceImpl implements PromotionCouponService{

    @Resource
    private PromotionCouponMapper promotionCouponMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return promotionCouponMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PromotionCoupon record) {
        return promotionCouponMapper.insertSelective(record);
    }

    @Override
    public PromotionCoupon selectByPrimaryKey(Long id) {
        return promotionCouponMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PromotionCoupon record) {
        return promotionCouponMapper.updateByPrimaryKeySelective(record);
    }

}
