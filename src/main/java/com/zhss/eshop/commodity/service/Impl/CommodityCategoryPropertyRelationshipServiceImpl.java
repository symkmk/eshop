package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.domain.model.CommodityCategoryPropertyRelationship;
import com.zhss.eshop.commodity.mapper.CommodityCategoryPropertyRelationshipMapper;
import com.zhss.eshop.commodity.service.CommodityCategoryPropertyRelationshipService;
@Service
public class CommodityCategoryPropertyRelationshipServiceImpl implements CommodityCategoryPropertyRelationshipService{

    @Resource
    private CommodityCategoryPropertyRelationshipMapper commodityCategoryPropertyRelationshipMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityCategoryPropertyRelationshipMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityCategoryPropertyRelationship record) {
        return commodityCategoryPropertyRelationshipMapper.insertSelective(record);
    }

    @Override
    public CommodityCategoryPropertyRelationship selectByPrimaryKey(Long id) {
        return commodityCategoryPropertyRelationshipMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityCategoryPropertyRelationship record) {
        return commodityCategoryPropertyRelationshipMapper.updateByPrimaryKeySelective(record);
    }

}
