package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.domain.dao.CommodityCategory;
import com.zhss.eshop.commodity.mapper.CommodityCategoryMapper;
import com.zhss.eshop.commodity.service.CommodityCategoryService;
@Service
public class CommodityCategoryServiceImpl implements CommodityCategoryService{

    @Resource
    private CommodityCategoryMapper commodityCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityCategory record) {
        return commodityCategoryMapper.insertSelective(record);
    }

    @Override
    public CommodityCategory selectByPrimaryKey(Long id) {
        return commodityCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityCategory record) {
        return commodityCategoryMapper.updateByPrimaryKeySelective(record);
    }

}
