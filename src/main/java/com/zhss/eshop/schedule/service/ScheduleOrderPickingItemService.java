package com.zhss.eshop.schedule.service;

import com.zhss.eshop.schedule.domain.model.ScheduleOrderPickingItem;
public interface ScheduleOrderPickingItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(ScheduleOrderPickingItem record);

    ScheduleOrderPickingItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScheduleOrderPickingItem record);

}
