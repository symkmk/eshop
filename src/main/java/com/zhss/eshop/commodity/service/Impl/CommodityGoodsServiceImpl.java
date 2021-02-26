package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.mapper.CommodityGoodsMapper;
import com.zhss.eshop.commodity.domain.dao.CommodityGoods;
import com.zhss.eshop.commodity.service.CommodityGoodsService;
@Service
public class CommodityGoodsServiceImpl implements CommodityGoodsService{

    @Resource
    private CommodityGoodsMapper commodityGoodsMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityGoodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityGoods record) {
        return commodityGoodsMapper.insertSelective(record);
    }

    @Override
    public CommodityGoods selectByPrimaryKey(Long id) {
        return commodityGoodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityGoods record) {
        return commodityGoodsMapper.updateByPrimaryKeySelective(record);
    }

}
