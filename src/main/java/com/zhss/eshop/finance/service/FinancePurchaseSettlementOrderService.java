package com.zhss.eshop.finance.service;

import com.zhss.eshop.finance.domain.dao.FinancePurchaseSettlementOrder;
public interface FinancePurchaseSettlementOrderService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(FinancePurchaseSettlementOrder record);

    FinancePurchaseSettlementOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FinancePurchaseSettlementOrder record);

}
