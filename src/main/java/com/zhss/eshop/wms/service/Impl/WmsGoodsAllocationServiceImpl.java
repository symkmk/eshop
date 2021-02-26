package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.domain.model.WmsGoodsAllocation;
import com.zhss.eshop.wms.mapper.WmsGoodsAllocationMapper;
import com.zhss.eshop.wms.service.WmsGoodsAllocationService;
@Service
public class WmsGoodsAllocationServiceImpl implements WmsGoodsAllocationService{

    @Resource
    private WmsGoodsAllocationMapper wmsGoodsAllocationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsGoodsAllocationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsGoodsAllocation record) {
        return wmsGoodsAllocationMapper.insertSelective(record);
    }

    @Override
    public WmsGoodsAllocation selectByPrimaryKey(Long id) {
        return wmsGoodsAllocationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsGoodsAllocation record) {
        return wmsGoodsAllocationMapper.updateByPrimaryKeySelective(record);
    }

}
