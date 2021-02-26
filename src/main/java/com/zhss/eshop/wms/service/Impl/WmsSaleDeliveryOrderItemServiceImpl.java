package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsSaleDeliveryOrderItemMapper;
import com.zhss.eshop.wms.domain.dao.WmsSaleDeliveryOrderItem;
import com.zhss.eshop.wms.service.WmsSaleDeliveryOrderItemService;
@Service
public class WmsSaleDeliveryOrderItemServiceImpl implements WmsSaleDeliveryOrderItemService{

    @Resource
    private WmsSaleDeliveryOrderItemMapper wmsSaleDeliveryOrderItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsSaleDeliveryOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsSaleDeliveryOrderItem record) {
        return wmsSaleDeliveryOrderItemMapper.insertSelective(record);
    }

    @Override
    public WmsSaleDeliveryOrderItem selectByPrimaryKey(Long id) {
        return wmsSaleDeliveryOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsSaleDeliveryOrderItem record) {
        return wmsSaleDeliveryOrderItemMapper.updateByPrimaryKeySelective(record);
    }

}
