package com.zhss.eshop.schedule.service;

import com.zhss.eshop.schedule.domain.model.ScheduleGoodsStock;
public interface ScheduleGoodsStockService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(ScheduleGoodsStock record);

    ScheduleGoodsStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScheduleGoodsStock record);

}
