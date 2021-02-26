package com.zhss.eshop.schedule.mapper;

import com.zhss.eshop.schedule.domain.dao.ScheduleGoodsAllocationStock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScheduleGoodsAllocationStockMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(ScheduleGoodsAllocationStock record);

    ScheduleGoodsAllocationStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScheduleGoodsAllocationStock record);
}