package com.zhss.eshop.commodity.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.commodity.mapper.CommodityGoodsDetailPictureMapper;
import com.zhss.eshop.commodity.domain.dao.CommodityGoodsDetailPicture;
import com.zhss.eshop.commodity.service.CommodityGoodsDetailPictureService;
@Service
public class CommodityGoodsDetailPictureServiceImpl implements CommodityGoodsDetailPictureService{

    @Resource
    private CommodityGoodsDetailPictureMapper commodityGoodsDetailPictureMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityGoodsDetailPictureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommodityGoodsDetailPicture record) {
        return commodityGoodsDetailPictureMapper.insertSelective(record);
    }

    @Override
    public CommodityGoodsDetailPicture selectByPrimaryKey(Long id) {
        return commodityGoodsDetailPictureMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityGoodsDetailPicture record) {
        return commodityGoodsDetailPictureMapper.updateByPrimaryKeySelective(record);
    }

}
