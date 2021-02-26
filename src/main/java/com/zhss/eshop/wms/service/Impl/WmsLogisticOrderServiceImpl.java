package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsLogisticOrderMapper;
import com.zhss.eshop.wms.domain.model.WmsLogisticOrder;
import com.zhss.eshop.wms.service.WmsLogisticOrderService;
@Service
public class WmsLogisticOrderServiceImpl implements WmsLogisticOrderService{

    @Resource
    private WmsLogisticOrderMapper wmsLogisticOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsLogisticOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsLogisticOrder record) {
        return wmsLogisticOrderMapper.insertSelective(record);
    }

    @Override
    public WmsLogisticOrder selectByPrimaryKey(Long id) {
        return wmsLogisticOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsLogisticOrder record) {
        return wmsLogisticOrderMapper.updateByPrimaryKeySelective(record);
    }

}
