package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.domain.model.CommodityGoodsSku;
import com.zhss.eshop.commodity.mapper.CommodityGoodsSkuMapper;
import com.zhss.eshop.commodity.service.CommodityGoodsSkuService;
@Service
public class CommodityGoodsSkuServiceImpl implements CommodityGoodsSkuService{

    @Resource
    private CommodityGoodsSkuMapper commodityGoodsSkuMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityGoodsSkuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityGoodsSku record) {
        return commodityGoodsSkuMapper.insertSelective(record);
    }

    @Override
    public CommodityGoodsSku selectByPrimaryKey(Long id) {
        return commodityGoodsSkuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityGoodsSku record) {
        return commodityGoodsSkuMapper.updateByPrimaryKeySelective(record);
    }

}
