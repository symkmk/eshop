package com.zhss.eshop.schedule.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.schedule.mapper.ScheduleOrderPickingItemMapper;
import com.zhss.eshop.schedule.domain.model.ScheduleOrderPickingItem;
import com.zhss.eshop.schedule.service.ScheduleOrderPickingItemService;
@Service
public class ScheduleOrderPickingItemServiceImpl implements ScheduleOrderPickingItemService{

    @Resource
    private ScheduleOrderPickingItemMapper scheduleOrderPickingItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return scheduleOrderPickingItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ScheduleOrderPickingItem record) {
        return scheduleOrderPickingItemMapper.insertSelective(record);
    }

    @Override
    public ScheduleOrderPickingItem selectByPrimaryKey(Long id) {
        return scheduleOrderPickingItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ScheduleOrderPickingItem record) {
        return scheduleOrderPickingItemMapper.updateByPrimaryKeySelective(record);
    }

}
