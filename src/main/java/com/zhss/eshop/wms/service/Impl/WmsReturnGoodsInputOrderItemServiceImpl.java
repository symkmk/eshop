package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsReturnGoodsInputOrderItemMapper;
import com.zhss.eshop.wms.domain.dao.WmsReturnGoodsInputOrderItem;
import com.zhss.eshop.wms.service.WmsReturnGoodsInputOrderItemService;
@Service
public class WmsReturnGoodsInputOrderItemServiceImpl implements WmsReturnGoodsInputOrderItemService{

    @Resource
    private WmsReturnGoodsInputOrderItemMapper wmsReturnGoodsInputOrderItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsReturnGoodsInputOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsReturnGoodsInputOrderItem record) {
        return wmsReturnGoodsInputOrderItemMapper.insertSelective(record);
    }

    @Override
    public WmsReturnGoodsInputOrderItem selectByPrimaryKey(Long id) {
        return wmsReturnGoodsInputOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsReturnGoodsInputOrderItem record) {
        return wmsReturnGoodsInputOrderItemMapper.updateByPrimaryKeySelective(record);
    }

}
