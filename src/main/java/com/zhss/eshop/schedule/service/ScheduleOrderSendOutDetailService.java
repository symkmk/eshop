package com.zhss.eshop.schedule.service;

import com.zhss.eshop.schedule.domain.dao.ScheduleOrderSendOutDetail;
public interface ScheduleOrderSendOutDetailService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(ScheduleOrderSendOutDetail record);

    ScheduleOrderSendOutDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScheduleOrderSendOutDetail record);

}
