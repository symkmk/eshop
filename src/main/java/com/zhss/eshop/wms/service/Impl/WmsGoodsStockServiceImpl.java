package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.domain.dao.WmsGoodsStock;
import com.zhss.eshop.wms.mapper.WmsGoodsStockMapper;
import com.zhss.eshop.wms.service.WmsGoodsStockService;
@Service
public class WmsGoodsStockServiceImpl implements WmsGoodsStockService{

    @Resource
    private WmsGoodsStockMapper wmsGoodsStockMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsGoodsStockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsGoodsStock record) {
        return wmsGoodsStockMapper.insertSelective(record);
    }

    @Override
    public WmsGoodsStock selectByPrimaryKey(Long id) {
        return wmsGoodsStockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsGoodsStock record) {
        return wmsGoodsStockMapper.updateByPrimaryKeySelective(record);
    }

}
