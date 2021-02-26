package com.zhss.eshop.schedule.mapper;

import com.zhss.eshop.schedule.domain.dao.ScheduleGoodsStock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScheduleGoodsStockMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(ScheduleGoodsStock record);

    ScheduleGoodsStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScheduleGoodsStock record);
}