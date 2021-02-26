package com.zhss.eshop.schedule.service;

import com.zhss.eshop.schedule.domain.model.ScheduleGoodsAllocationStock;
public interface ScheduleGoodsAllocationStockService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(ScheduleGoodsAllocationStock record);

    ScheduleGoodsAllocationStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScheduleGoodsAllocationStock record);

}
