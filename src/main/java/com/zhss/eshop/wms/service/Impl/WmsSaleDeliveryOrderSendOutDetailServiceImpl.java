package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsSaleDeliveryOrderSendOutDetailMapper;
import com.zhss.eshop.wms.domain.dao.WmsSaleDeliveryOrderSendOutDetail;
import com.zhss.eshop.wms.service.WmsSaleDeliveryOrderSendOutDetailService;
@Service
public class WmsSaleDeliveryOrderSendOutDetailServiceImpl implements WmsSaleDeliveryOrderSendOutDetailService{

    @Resource
    private WmsSaleDeliveryOrderSendOutDetailMapper wmsSaleDeliveryOrderSendOutDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsSaleDeliveryOrderSendOutDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsSaleDeliveryOrderSendOutDetail record) {
        return wmsSaleDeliveryOrderSendOutDetailMapper.insertSelective(record);
    }

    @Override
    public WmsSaleDeliveryOrderSendOutDetail selectByPrimaryKey(Long id) {
        return wmsSaleDeliveryOrderSendOutDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsSaleDeliveryOrderSendOutDetail record) {
        return wmsSaleDeliveryOrderSendOutDetailMapper.updateByPrimaryKeySelective(record);
    }

}
