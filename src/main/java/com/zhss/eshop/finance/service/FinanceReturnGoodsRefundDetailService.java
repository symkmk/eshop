package com.zhss.eshop.finance.service;

import com.zhss.eshop.finance.domain.model.FinanceReturnGoodsRefundDetail;
public interface FinanceReturnGoodsRefundDetailService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(FinanceReturnGoodsRefundDetail record);

    FinanceReturnGoodsRefundDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FinanceReturnGoodsRefundDetail record);

}
