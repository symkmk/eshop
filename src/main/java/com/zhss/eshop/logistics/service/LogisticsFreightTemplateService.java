package com.zhss.eshop.logistics.service;

import com.zhss.eshop.logistics.domain.model.LogisticsFreightTemplate;
public interface LogisticsFreightTemplateService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(LogisticsFreightTemplate record);

    LogisticsFreightTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LogisticsFreightTemplate record);

}
