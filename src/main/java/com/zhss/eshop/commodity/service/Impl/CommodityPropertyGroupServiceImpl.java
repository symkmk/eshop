package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.domain.model.CommodityPropertyGroup;
import com.zhss.eshop.commodity.mapper.CommodityPropertyGroupMapper;
import com.zhss.eshop.commodity.service.CommodityPropertyGroupService;
@Service
public class CommodityPropertyGroupServiceImpl implements CommodityPropertyGroupService{

    @Resource
    private CommodityPropertyGroupMapper commodityPropertyGroupMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityPropertyGroupMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityPropertyGroup record) {
        return commodityPropertyGroupMapper.insertSelective(record);
    }

    @Override
    public CommodityPropertyGroup selectByPrimaryKey(Long id) {
        return commodityPropertyGroupMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityPropertyGroup record) {
        return commodityPropertyGroupMapper.updateByPrimaryKeySelective(record);
    }

}
