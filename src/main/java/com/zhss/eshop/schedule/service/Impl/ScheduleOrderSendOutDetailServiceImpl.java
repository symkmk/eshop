package com.zhss.eshop.schedule.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.schedule.domain.model.ScheduleOrderSendOutDetail;
import com.zhss.eshop.schedule.mapper.ScheduleOrderSendOutDetailMapper;
import com.zhss.eshop.schedule.service.ScheduleOrderSendOutDetailService;
@Service
public class ScheduleOrderSendOutDetailServiceImpl implements ScheduleOrderSendOutDetailService{

    @Resource
    private ScheduleOrderSendOutDetailMapper scheduleOrderSendOutDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return scheduleOrderSendOutDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ScheduleOrderSendOutDetail record) {
        return scheduleOrderSendOutDetailMapper.insertSelective(record);
    }

    @Override
    public ScheduleOrderSendOutDetail selectByPrimaryKey(Long id) {
        return scheduleOrderSendOutDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ScheduleOrderSendOutDetail record) {
        return scheduleOrderSendOutDetailMapper.updateByPrimaryKeySelective(record);
    }

}
