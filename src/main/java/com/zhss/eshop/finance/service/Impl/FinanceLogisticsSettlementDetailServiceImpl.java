package com.zhss.eshop.finance.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.finance.domain.dao.FinanceLogisticsSettlementDetail;
import com.zhss.eshop.finance.mapper.FinanceLogisticsSettlementDetailMapper;
import com.zhss.eshop.finance.service.FinanceLogisticsSettlementDetailService;
@Service
public class FinanceLogisticsSettlementDetailServiceImpl implements FinanceLogisticsSettlementDetailService{

    @Resource
    private FinanceLogisticsSettlementDetailMapper financeLogisticsSettlementDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return financeLogisticsSettlementDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(FinanceLogisticsSettlementDetail record) {
        return financeLogisticsSettlementDetailMapper.insertSelective(record);
    }

    @Override
    public FinanceLogisticsSettlementDetail selectByPrimaryKey(Long id) {
        return financeLogisticsSettlementDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FinanceLogisticsSettlementDetail record) {
        return financeLogisticsSettlementDetailMapper.updateByPrimaryKeySelective(record);
    }

}
