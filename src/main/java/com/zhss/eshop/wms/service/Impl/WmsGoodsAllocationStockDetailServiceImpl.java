package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsGoodsAllocationStockDetailMapper;
import com.zhss.eshop.wms.domain.dao.WmsGoodsAllocationStockDetail;
import com.zhss.eshop.wms.service.WmsGoodsAllocationStockDetailService;
@Service
public class WmsGoodsAllocationStockDetailServiceImpl implements WmsGoodsAllocationStockDetailService{

    @Resource
    private WmsGoodsAllocationStockDetailMapper wmsGoodsAllocationStockDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsGoodsAllocationStockDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsGoodsAllocationStockDetail record) {
        return wmsGoodsAllocationStockDetailMapper.insertSelective(record);
    }

    @Override
    public WmsGoodsAllocationStockDetail selectByPrimaryKey(Long id) {
        return wmsGoodsAllocationStockDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsGoodsAllocationStockDetail record) {
        return wmsGoodsAllocationStockDetailMapper.updateByPrimaryKeySelective(record);
    }

}
