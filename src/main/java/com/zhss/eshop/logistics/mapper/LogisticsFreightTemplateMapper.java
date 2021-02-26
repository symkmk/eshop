package com.zhss.eshop.logistics.mapper;

import com.zhss.eshop.logistics.domain.model.LogisticsFreightTemplate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogisticsFreightTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(LogisticsFreightTemplate record);

    LogisticsFreightTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LogisticsFreightTemplate record);
}
