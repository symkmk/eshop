package com.zhss.eshop.finance.service;

import com.zhss.eshop.finance.domain.model.FinancePurchaseSettlementOrderItem;
public interface FinancePurchaseSettlementOrderItemService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(FinancePurchaseSettlementOrderItem record);

    FinancePurchaseSettlementOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FinancePurchaseSettlementOrderItem record);

}
