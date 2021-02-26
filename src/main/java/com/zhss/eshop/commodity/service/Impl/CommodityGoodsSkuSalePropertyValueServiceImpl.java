package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.mapper.CommodityGoodsSkuSalePropertyValueMapper;
import com.zhss.eshop.commodity.domain.model.CommodityGoodsSkuSalePropertyValue;
import com.zhss.eshop.commodity.service.CommodityGoodsSkuSalePropertyValueService;
@Service
public class CommodityGoodsSkuSalePropertyValueServiceImpl implements CommodityGoodsSkuSalePropertyValueService{

    @Resource
    private CommodityGoodsSkuSalePropertyValueMapper commodityGoodsSkuSalePropertyValueMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityGoodsSkuSalePropertyValueMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityGoodsSkuSalePropertyValue record) {
        return commodityGoodsSkuSalePropertyValueMapper.insertSelective(record);
    }

    @Override
    public CommodityGoodsSkuSalePropertyValue selectByPrimaryKey(Long id) {
        return commodityGoodsSkuSalePropertyValueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityGoodsSkuSalePropertyValue record) {
        return commodityGoodsSkuSalePropertyValueMapper.updateByPrimaryKeySelective(record);
    }

}
