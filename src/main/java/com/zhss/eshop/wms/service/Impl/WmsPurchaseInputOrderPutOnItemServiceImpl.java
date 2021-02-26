package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsPurchaseInputOrderPutOnItemMapper;
import com.zhss.eshop.wms.domain.dao.WmsPurchaseInputOrderPutOnItem;
import com.zhss.eshop.wms.service.WmsPurchaseInputOrderPutOnItemService;
@Service
public class WmsPurchaseInputOrderPutOnItemServiceImpl implements WmsPurchaseInputOrderPutOnItemService{

    @Resource
    private WmsPurchaseInputOrderPutOnItemMapper wmsPurchaseInputOrderPutOnItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsPurchaseInputOrderPutOnItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsPurchaseInputOrderPutOnItem record) {
        return wmsPurchaseInputOrderPutOnItemMapper.insertSelective(record);
    }

    @Override
    public WmsPurchaseInputOrderPutOnItem selectByPrimaryKey(Long id) {
        return wmsPurchaseInputOrderPutOnItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsPurchaseInputOrderPutOnItem record) {
        return wmsPurchaseInputOrderPutOnItemMapper.updateByPrimaryKeySelective(record);
    }

}
