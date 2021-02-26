package com.zhss.eshop.schedule.mapper;

import com.zhss.eshop.schedule.domain.model.ScheduleGoodsAllocationStockDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScheduleGoodsAllocationStockDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(ScheduleGoodsAllocationStockDetail record);

    ScheduleGoodsAllocationStockDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScheduleGoodsAllocationStockDetail record);
}
