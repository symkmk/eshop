package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.domain.model.WmsGoodsAllocationStock;
import com.zhss.eshop.wms.mapper.WmsGoodsAllocationStockMapper;
import com.zhss.eshop.wms.service.WmsGoodsAllocationStockService;
@Service
public class WmsGoodsAllocationStockServiceImpl implements WmsGoodsAllocationStockService{

    @Resource
    private WmsGoodsAllocationStockMapper wmsGoodsAllocationStockMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsGoodsAllocationStockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsGoodsAllocationStock record) {
        return wmsGoodsAllocationStockMapper.insertSelective(record);
    }

    @Override
    public WmsGoodsAllocationStock selectByPrimaryKey(Long id) {
        return wmsGoodsAllocationStockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsGoodsAllocationStock record) {
        return wmsGoodsAllocationStockMapper.updateByPrimaryKeySelective(record);
    }

}
