package com.zhss.eshop.finance.mapper;

import com.zhss.eshop.finance.domain.model.FinancePurchaseSettlementOrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FinancePurchaseSettlementOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(FinancePurchaseSettlementOrderItem record);

    FinancePurchaseSettlementOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FinancePurchaseSettlementOrderItem record);
}
