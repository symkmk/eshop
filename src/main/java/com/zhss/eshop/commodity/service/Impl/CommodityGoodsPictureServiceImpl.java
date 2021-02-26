package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.mapper.CommodityGoodsPictureMapper;
import com.zhss.eshop.commodity.domain.dao.CommodityGoodsPicture;
import com.zhss.eshop.commodity.service.CommodityGoodsPictureService;
@Service
public class CommodityGoodsPictureServiceImpl implements CommodityGoodsPictureService{

    @Resource
    private CommodityGoodsPictureMapper commodityGoodsPictureMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityGoodsPictureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityGoodsPicture record) {
        return commodityGoodsPictureMapper.insertSelective(record);
    }

    @Override
    public CommodityGoodsPicture selectByPrimaryKey(Long id) {
        return commodityGoodsPictureMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityGoodsPicture record) {
        return commodityGoodsPictureMapper.updateByPrimaryKeySelective(record);
    }

}
