package com.zhss.eshop.schedule.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.schedule.mapper.ScheduleGoodsStockMapper;
import com.zhss.eshop.schedule.domain.dao.ScheduleGoodsStock;
import com.zhss.eshop.schedule.service.ScheduleGoodsStockService;
@Service
public class ScheduleGoodsStockServiceImpl implements ScheduleGoodsStockService{

    @Resource
    private ScheduleGoodsStockMapper scheduleGoodsStockMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return scheduleGoodsStockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ScheduleGoodsStock record) {
        return scheduleGoodsStockMapper.insertSelective(record);
    }

    @Override
    public ScheduleGoodsStock selectByPrimaryKey(Long id) {
        return scheduleGoodsStockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ScheduleGoodsStock record) {
        return scheduleGoodsStockMapper.updateByPrimaryKeySelective(record);
    }

}
