package com.zhss.eshop.schedule.mapper;

import com.zhss.eshop.schedule.domain.model.ScheduleOrderPickingItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScheduleOrderPickingItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(ScheduleOrderPickingItem record);

    ScheduleOrderPickingItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScheduleOrderPickingItem record);
}
