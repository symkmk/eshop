package com.zhss.eshop.finance.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.finance.domain.model.FinancePurchaseSettlementOrder;
import com.zhss.eshop.finance.mapper.FinancePurchaseSettlementOrderMapper;
import com.zhss.eshop.finance.service.FinancePurchaseSettlementOrderService;
@Service
public class FinancePurchaseSettlementOrderServiceImpl implements FinancePurchaseSettlementOrderService{

    @Resource
    private FinancePurchaseSettlementOrderMapper financePurchaseSettlementOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return financePurchaseSettlementOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(FinancePurchaseSettlementOrder record) {
        return financePurchaseSettlementOrderMapper.insertSelective(record);
    }

    @Override
    public FinancePurchaseSettlementOrder selectByPrimaryKey(Long id) {
        return financePurchaseSettlementOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FinancePurchaseSettlementOrder record) {
        return financePurchaseSettlementOrderMapper.updateByPrimaryKeySelective(record);
    }

}
