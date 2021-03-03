package com.zhss.eshop.promotion.service.Impl;

import com.zhss.eshop.promotion.domain.dto.CouponDTO;
import com.zhss.eshop.promotion.domain.dto.PromotionActivityDTO;
import com.zhss.eshop.promotion.service.PromotionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 促销中心service组件
 * @author zhonghuashishan
 *
 */
@Service
public class PromotionServiceImpl implements PromotionService {

	private static final Logger logger = LoggerFactory.getLogger(PromotionServiceImpl.class);


	@Override
	public List<PromotionActivityDTO> listByGoodsId(Long goodsId) {
		return null;
	}

	@Override
	public PromotionActivityDTO getById(Long id) {
		return null;
	}

	@Override
	public List<CouponDTO> listValidByUserAccountId(Long userAccountId) {
		return null;
	}

	@Override
	public Boolean useCoupon(Long couponId, Long userAccountId) {
		return null;
	}
}
