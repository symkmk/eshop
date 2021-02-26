package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsSendOutOrderItemMapper;
import com.zhss.eshop.wms.domain.dao.WmsSendOutOrderItem;
import com.zhss.eshop.wms.service.WmsSendOutOrderItemService;
@Service
public class WmsSendOutOrderItemServiceImpl implements WmsSendOutOrderItemService{

    @Resource
    private WmsSendOutOrderItemMapper wmsSendOutOrderItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsSendOutOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsSendOutOrderItem record) {
        return wmsSendOutOrderItemMapper.insertSelective(record);
    }

    @Override
    public WmsSendOutOrderItem selectByPrimaryKey(Long id) {
        return wmsSendOutOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsSendOutOrderItem record) {
        return wmsSendOutOrderItemMapper.updateByPrimaryKeySelective(record);
    }

}
