package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.mapper.CommodityPropertyMapper;
import com.zhss.eshop.commodity.domain.model.CommodityProperty;
import com.zhss.eshop.commodity.service.CommodityPropertyService;
@Service
public class CommodityPropertyServiceImpl implements CommodityPropertyService{

    @Resource
    private CommodityPropertyMapper commodityPropertyMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityPropertyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityProperty record) {
        return commodityPropertyMapper.insertSelective(record);
    }

    @Override
    public CommodityProperty selectByPrimaryKey(Long id) {
        return commodityPropertyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityProperty record) {
        return commodityPropertyMapper.updateByPrimaryKeySelective(record);
    }

}
