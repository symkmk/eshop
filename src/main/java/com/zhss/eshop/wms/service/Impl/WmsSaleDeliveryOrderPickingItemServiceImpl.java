package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsSaleDeliveryOrderPickingItemMapper;
import com.zhss.eshop.wms.domain.dao.WmsSaleDeliveryOrderPickingItem;
import com.zhss.eshop.wms.service.WmsSaleDeliveryOrderPickingItemService;
@Service
public class WmsSaleDeliveryOrderPickingItemServiceImpl implements WmsSaleDeliveryOrderPickingItemService{

    @Resource
    private WmsSaleDeliveryOrderPickingItemMapper wmsSaleDeliveryOrderPickingItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsSaleDeliveryOrderPickingItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsSaleDeliveryOrderPickingItem record) {
        return wmsSaleDeliveryOrderPickingItemMapper.insertSelective(record);
    }

    @Override
    public WmsSaleDeliveryOrderPickingItem selectByPrimaryKey(Long id) {
        return wmsSaleDeliveryOrderPickingItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsSaleDeliveryOrderPickingItem record) {
        return wmsSaleDeliveryOrderPickingItemMapper.updateByPrimaryKeySelective(record);
    }

}
