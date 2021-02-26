package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.mapper.CommodityPropertyGroupRelationshipMapper;
import com.zhss.eshop.commodity.domain.model.CommodityPropertyGroupRelationship;
import com.zhss.eshop.commodity.service.CommodityPropertyGroupRelationshipService;
@Service
public class CommodityPropertyGroupRelationshipServiceImpl implements CommodityPropertyGroupRelationshipService{

    @Resource
    private CommodityPropertyGroupRelationshipMapper commodityPropertyGroupRelationshipMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityPropertyGroupRelationshipMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityPropertyGroupRelationship record) {
        return commodityPropertyGroupRelationshipMapper.insertSelective(record);
    }

    @Override
    public CommodityPropertyGroupRelationship selectByPrimaryKey(Long id) {
        return commodityPropertyGroupRelationshipMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityPropertyGroupRelationship record) {
        return commodityPropertyGroupRelationshipMapper.updateByPrimaryKeySelective(record);
    }

}
