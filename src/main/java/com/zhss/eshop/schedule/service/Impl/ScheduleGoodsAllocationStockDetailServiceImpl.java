package com.zhss.eshop.schedule.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.schedule.domain.model.ScheduleGoodsAllocationStockDetail;
import com.zhss.eshop.schedule.mapper.ScheduleGoodsAllocationStockDetailMapper;
import com.zhss.eshop.schedule.service.ScheduleGoodsAllocationStockDetailService;
@Service
public class ScheduleGoodsAllocationStockDetailServiceImpl implements ScheduleGoodsAllocationStockDetailService{

    @Resource
    private ScheduleGoodsAllocationStockDetailMapper scheduleGoodsAllocationStockDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return scheduleGoodsAllocationStockDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ScheduleGoodsAllocationStockDetail record) {
        return scheduleGoodsAllocationStockDetailMapper.insertSelective(record);
    }

    @Override
    public ScheduleGoodsAllocationStockDetail selectByPrimaryKey(Long id) {
        return scheduleGoodsAllocationStockDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ScheduleGoodsAllocationStockDetail record) {
        return scheduleGoodsAllocationStockDetailMapper.updateByPrimaryKeySelective(record);
    }

}
