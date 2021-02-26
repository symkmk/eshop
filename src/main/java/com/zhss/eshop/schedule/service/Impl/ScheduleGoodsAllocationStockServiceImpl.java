package com.zhss.eshop.schedule.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.schedule.domain.model.ScheduleGoodsAllocationStock;
import com.zhss.eshop.schedule.mapper.ScheduleGoodsAllocationStockMapper;
import com.zhss.eshop.schedule.service.ScheduleGoodsAllocationStockService;
@Service
public class ScheduleGoodsAllocationStockServiceImpl implements ScheduleGoodsAllocationStockService{

    @Resource
    private ScheduleGoodsAllocationStockMapper scheduleGoodsAllocationStockMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return scheduleGoodsAllocationStockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ScheduleGoodsAllocationStock record) {
        return scheduleGoodsAllocationStockMapper.insertSelective(record);
    }

    @Override
    public ScheduleGoodsAllocationStock selectByPrimaryKey(Long id) {
        return scheduleGoodsAllocationStockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ScheduleGoodsAllocationStock record) {
        return scheduleGoodsAllocationStockMapper.updateByPrimaryKeySelective(record);
    }

}
