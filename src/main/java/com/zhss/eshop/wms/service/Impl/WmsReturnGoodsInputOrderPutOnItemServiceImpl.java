package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsReturnGoodsInputOrderPutOnItemMapper;
import com.zhss.eshop.wms.domain.model.WmsReturnGoodsInputOrderPutOnItem;
import com.zhss.eshop.wms.service.WmsReturnGoodsInputOrderPutOnItemService;
@Service
public class WmsReturnGoodsInputOrderPutOnItemServiceImpl implements WmsReturnGoodsInputOrderPutOnItemService{

    @Resource
    private WmsReturnGoodsInputOrderPutOnItemMapper wmsReturnGoodsInputOrderPutOnItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsReturnGoodsInputOrderPutOnItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsReturnGoodsInputOrderPutOnItem record) {
        return wmsReturnGoodsInputOrderPutOnItemMapper.insertSelective(record);
    }

    @Override
    public WmsReturnGoodsInputOrderPutOnItem selectByPrimaryKey(Long id) {
        return wmsReturnGoodsInputOrderPutOnItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsReturnGoodsInputOrderPutOnItem record) {
        return wmsReturnGoodsInputOrderPutOnItemMapper.updateByPrimaryKeySelective(record);
    }

}
