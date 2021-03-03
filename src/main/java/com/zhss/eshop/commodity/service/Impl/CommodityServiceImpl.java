package com.zhss.eshop.commodity.service.Impl;


import com.zhss.eshop.commodity.domain.dto.GoodsDTO;
import com.zhss.eshop.commodity.domain.dto.GoodsSkuDTO;
import com.zhss.eshop.commodity.service.CommodityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 商品中心对外接口service组件
 * @author zhonghuashishan
 *
 */
@Service
public class CommodityServiceImpl implements CommodityService {

	private static final Logger logger = LoggerFactory.getLogger(CommodityServiceImpl.class);


	@Override
	public GoodsSkuDTO getGoodsSkuById(Long goodsSkuId) {
		return null;
	}

	@Override
	public GoodsDTO getGoodsById(Long goodsId) {
		return null;
	}
}
