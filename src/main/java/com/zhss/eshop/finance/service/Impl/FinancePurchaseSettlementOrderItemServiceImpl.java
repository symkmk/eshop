package com.zhss.eshop.finance.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.finance.mapper.FinancePurchaseSettlementOrderItemMapper;
import com.zhss.eshop.finance.domain.dao.FinancePurchaseSettlementOrderItem;
import com.zhss.eshop.finance.service.FinancePurchaseSettlementOrderItemService;
@Service
public class FinancePurchaseSettlementOrderItemServiceImpl implements FinancePurchaseSettlementOrderItemService{

    @Resource
    private FinancePurchaseSettlementOrderItemMapper financePurchaseSettlementOrderItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return financePurchaseSettlementOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(FinancePurchaseSettlementOrderItem record) {
        return financePurchaseSettlementOrderItemMapper.insertSelective(record);
    }

    @Override
    public FinancePurchaseSettlementOrderItem selectByPrimaryKey(Long id) {
        return financePurchaseSettlementOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FinancePurchaseSettlementOrderItem record) {
        return financePurchaseSettlementOrderItemMapper.updateByPrimaryKeySelective(record);
    }

}
