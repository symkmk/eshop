package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsPurchaseInputOrderItemMapper;
import com.zhss.eshop.wms.domain.dao.WmsPurchaseInputOrderItem;
import com.zhss.eshop.wms.service.WmsPurchaseInputOrderItemService;
@Service
public class WmsPurchaseInputOrderItemServiceImpl implements WmsPurchaseInputOrderItemService{

    @Resource
    private WmsPurchaseInputOrderItemMapper wmsPurchaseInputOrderItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsPurchaseInputOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsPurchaseInputOrderItem record) {
        return wmsPurchaseInputOrderItemMapper.insertSelective(record);
    }

    @Override
    public WmsPurchaseInputOrderItem selectByPrimaryKey(Long id) {
        return wmsPurchaseInputOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsPurchaseInputOrderItem record) {
        return wmsPurchaseInputOrderItemMapper.updateByPrimaryKeySelective(record);
    }

}
