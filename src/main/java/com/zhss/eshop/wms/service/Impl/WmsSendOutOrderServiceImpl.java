package com.zhss.eshop.wms.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.wms.mapper.WmsSendOutOrderMapper;
import com.zhss.eshop.wms.domain.model.WmsSendOutOrder;
import com.zhss.eshop.wms.service.WmsSendOutOrderService;
@Service
public class WmsSendOutOrderServiceImpl implements WmsSendOutOrderService{

    @Resource
    private WmsSendOutOrderMapper wmsSendOutOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsSendOutOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WmsSendOutOrder record) {
        return wmsSendOutOrderMapper.insertSelective(record);
    }

    @Override
    public WmsSendOutOrder selectByPrimaryKey(Long id) {
        return wmsSendOutOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsSendOutOrder record) {
        return wmsSendOutOrderMapper.updateByPrimaryKeySelective(record);
    }

}
