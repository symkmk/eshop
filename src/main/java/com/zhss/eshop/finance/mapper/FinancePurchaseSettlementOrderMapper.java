package com.zhss.eshop.finance.mapper;

import com.zhss.eshop.finance.domain.model.FinancePurchaseSettlementOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FinancePurchaseSettlementOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(FinancePurchaseSettlementOrder record);

    FinancePurchaseSettlementOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FinancePurchaseSettlementOrder record);
}
