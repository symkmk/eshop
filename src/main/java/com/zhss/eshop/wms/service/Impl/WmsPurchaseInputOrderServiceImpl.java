package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsPurchaseInputOrderMapper;
import com.zhss.eshop.wms.domain.model.WmsPurchaseInputOrder;
import com.zhss.eshop.wms.service.WmsPurchaseInputOrderService;
@Service
public class WmsPurchaseInputOrderServiceImpl implements WmsPurchaseInputOrderService{

    @Resource
    private WmsPurchaseInputOrderMapper wmsPurchaseInputOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsPurchaseInputOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsPurchaseInputOrder record) {
        return wmsPurchaseInputOrderMapper.insertSelective(record);
    }

    @Override
    public WmsPurchaseInputOrder selectByPrimaryKey(Long id) {
        return wmsPurchaseInputOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsPurchaseInputOrder record) {
        return wmsPurchaseInputOrderMapper.updateByPrimaryKeySelective(record);
    }

}
