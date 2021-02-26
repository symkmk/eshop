package com.zhss.eshop.finance.mapper;

import com.zhss.eshop.finance.domain.dao.FinanceLogisticsSettlementDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FinanceLogisticsSettlementDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(FinanceLogisticsSettlementDetail record);

    FinanceLogisticsSettlementDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FinanceLogisticsSettlementDetail record);
}