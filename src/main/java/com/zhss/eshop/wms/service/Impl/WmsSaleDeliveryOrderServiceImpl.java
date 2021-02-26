package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.domain.dao.WmsSaleDeliveryOrder;
import com.zhss.eshop.wms.mapper.WmsSaleDeliveryOrderMapper;
import com.zhss.eshop.wms.service.WmsSaleDeliveryOrderService;
@Service
public class WmsSaleDeliveryOrderServiceImpl implements WmsSaleDeliveryOrderService{

    @Resource
    private WmsSaleDeliveryOrderMapper wmsSaleDeliveryOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsSaleDeliveryOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsSaleDeliveryOrder record) {
        return wmsSaleDeliveryOrderMapper.insertSelective(record);
    }

    @Override
    public WmsSaleDeliveryOrder selectByPrimaryKey(Long id) {
        return wmsSaleDeliveryOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsSaleDeliveryOrder record) {
        return wmsSaleDeliveryOrderMapper.updateByPrimaryKeySelective(record);
    }

}
