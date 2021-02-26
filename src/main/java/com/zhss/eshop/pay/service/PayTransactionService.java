package com.zhss.eshop.pay.service;

import com.zhss.eshop.pay.domain.model.PayTransaction;
public interface PayTransactionService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(PayTransaction record);

    PayTransaction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayTransaction record);

}
