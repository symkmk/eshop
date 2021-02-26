package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.domain.dao.CommodityBrand;
import com.zhss.eshop.commodity.mapper.CommodityBrandMapper;
import com.zhss.eshop.commodity.service.CommodityBrandService;
@Service
public class CommodityBrandServiceImpl implements CommodityBrandService{

    @Resource
    private CommodityBrandMapper commodityBrandMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityBrand record) {
        return commodityBrandMapper.insertSelective(record);
    }

    @Override
    public CommodityBrand selectByPrimaryKey(Long id) {
        return commodityBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityBrand record) {
        return commodityBrandMapper.updateByPrimaryKeySelective(record);
    }

}
