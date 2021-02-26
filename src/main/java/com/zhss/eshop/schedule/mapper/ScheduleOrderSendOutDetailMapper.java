package com.zhss.eshop.schedule.mapper;

import com.zhss.eshop.schedule.domain.model.ScheduleOrderSendOutDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScheduleOrderSendOutDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(ScheduleOrderSendOutDetail record);

    ScheduleOrderSendOutDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScheduleOrderSendOutDetail record);
}
