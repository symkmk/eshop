package com.zhss.eshop.schedule.service;

import com.zhss.eshop.schedule.domain.model.ScheduleGoodsAllocationStockDetail;
public interface ScheduleGoodsAllocationStockDetailService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(ScheduleGoodsAllocationStockDetail record);

    ScheduleGoodsAllocationStockDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScheduleGoodsAllocationStockDetail record);

}
