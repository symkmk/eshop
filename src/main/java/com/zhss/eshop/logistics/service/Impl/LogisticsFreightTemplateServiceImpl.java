package com.zhss.eshop.logistics.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.logistics.mapper.LogisticsFreightTemplateMapper;
import com.zhss.eshop.logistics.domain.dao.LogisticsFreightTemplate;
import com.zhss.eshop.logistics.service.LogisticsFreightTemplateService;
@Service
public class LogisticsFreightTemplateServiceImpl implements LogisticsFreightTemplateService{

    @Resource
    private LogisticsFreightTemplateMapper logisticsFreightTemplateMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return logisticsFreightTemplateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(LogisticsFreightTemplate record) {
        return logisticsFreightTemplateMapper.insertSelective(record);
    }

    @Override
    public LogisticsFreightTemplate selectByPrimaryKey(Long id) {
        return logisticsFreightTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LogisticsFreightTemplate record) {
        return logisticsFreightTemplateMapper.updateByPrimaryKeySelective(record);
    }

}
