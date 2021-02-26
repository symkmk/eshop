package com.zhss.eshop.order.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.order.domain.dao.OrderOperateLog;
import com.zhss.eshop.order.mapper.OrderOperateLogMapper;
import com.zhss.eshop.order.service.OrderOperateLogService;
@Service
public class OrderOperateLogServiceImpl implements OrderOperateLogService{

    @Resource
    private OrderOperateLogMapper orderOperateLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderOperateLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(OrderOperateLog record) {
        return orderOperateLogMapper.insertSelective(record);
    }

    @Override
    public OrderOperateLog selectByPrimaryKey(Long id) {
        return orderOperateLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderOperateLog record) {
        return orderOperateLogMapper.updateByPrimaryKeySelective(record);
    }

}
