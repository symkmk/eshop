package com.zhss.eshop.finance.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.finance.domain.model.FinanceReturnGoodsRefundDetail;
import com.zhss.eshop.finance.mapper.FinanceReturnGoodsRefundDetailMapper;
import com.zhss.eshop.finance.service.FinanceReturnGoodsRefundDetailService;
@Service
public class FinanceReturnGoodsRefundDetailServiceImpl implements FinanceReturnGoodsRefundDetailService{

    @Resource
    private FinanceReturnGoodsRefundDetailMapper financeReturnGoodsRefundDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return financeReturnGoodsRefundDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(FinanceReturnGoodsRefundDetail record) {
        return financeReturnGoodsRefundDetailMapper.insertSelective(record);
    }

    @Override
    public FinanceReturnGoodsRefundDetail selectByPrimaryKey(Long id) {
        return financeReturnGoodsRefundDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FinanceReturnGoodsRefundDetail record) {
        return financeReturnGoodsRefundDetailMapper.updateByPrimaryKeySelective(record);
    }

}
