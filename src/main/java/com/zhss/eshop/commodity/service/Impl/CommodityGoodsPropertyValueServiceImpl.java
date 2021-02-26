package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.domain.model.CommodityGoodsPropertyValue;
import com.zhss.eshop.commodity.mapper.CommodityGoodsPropertyValueMapper;
import com.zhss.eshop.commodity.service.CommodityGoodsPropertyValueService;
@Service
public class CommodityGoodsPropertyValueServiceImpl implements CommodityGoodsPropertyValueService{

    @Resource
    private CommodityGoodsPropertyValueMapper commodityGoodsPropertyValueMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityGoodsPropertyValueMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityGoodsPropertyValue record) {
        return commodityGoodsPropertyValueMapper.insertSelective(record);
    }

    @Override
    public CommodityGoodsPropertyValue selectByPrimaryKey(Long id) {
        return commodityGoodsPropertyValueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityGoodsPropertyValue record) {
        return commodityGoodsPropertyValueMapper.updateByPrimaryKeySelective(record);
    }

}
