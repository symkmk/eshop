package com.zhss.eshop.finance.service;

import com.zhss.eshop.finance.domain.dao.FinanceLogisticsSettlementDetail;
public interface FinanceLogisticsSettlementDetailService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(FinanceLogisticsSettlementDetail record);

    FinanceLogisticsSettlementDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FinanceLogisticsSettlementDetail record);

}
