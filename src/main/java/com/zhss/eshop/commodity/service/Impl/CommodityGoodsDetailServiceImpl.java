package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.mapper.CommodityGoodsDetailMapper;
import com.zhss.eshop.commodity.domain.dao.CommodityGoodsDetail;
import com.zhss.eshop.commodity.service.CommodityGoodsDetailService;
@Service
public class CommodityGoodsDetailServiceImpl implements CommodityGoodsDetailService{

    @Resource
    private CommodityGoodsDetailMapper commodityGoodsDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityGoodsDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityGoodsDetail record) {
        return commodityGoodsDetailMapper.insertSelective(record);
    }

    @Override
    public CommodityGoodsDetail selectByPrimaryKey(Long id) {
        return commodityGoodsDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityGoodsDetail record) {
        return commodityGoodsDetailMapper.updateByPrimaryKeySelective(record);
    }

}
