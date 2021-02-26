package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsReturnGoodsInputOrderMapper;
import com.zhss.eshop.wms.domain.model.WmsReturnGoodsInputOrder;
import com.zhss.eshop.wms.service.WmsReturnGoodsInputOrderService;
@Service
public class WmsReturnGoodsInputOrderServiceImpl implements WmsReturnGoodsInputOrderService{

    @Resource
    private WmsReturnGoodsInputOrderMapper wmsReturnGoodsInputOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsReturnGoodsInputOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsReturnGoodsInputOrder record) {
        return wmsReturnGoodsInputOrderMapper.insertSelective(record);
    }

    @Override
    public WmsReturnGoodsInputOrder selectByPrimaryKey(Long id) {
        return wmsReturnGoodsInputOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsReturnGoodsInputOrder record) {
        return wmsReturnGoodsInputOrderMapper.updateByPrimaryKeySelective(record);
    }

}
