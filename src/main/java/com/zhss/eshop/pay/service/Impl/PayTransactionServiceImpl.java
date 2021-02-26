package com.zhss.eshop.pay.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.pay.domain.dao.PayTransaction;
import com.zhss.eshop.pay.mapper.PayTransactionMapper;
import com.zhss.eshop.pay.service.PayTransactionService;
@Service
public class PayTransactionServiceImpl implements PayTransactionService{

    @Resource
    private PayTransactionMapper payTransactionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return payTransactionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PayTransaction record) {
        return payTransactionMapper.insertSelective(record);
    }

    @Override
    public PayTransaction selectByPrimaryKey(Long id) {
        return payTransactionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PayTransaction record) {
        return payTransactionMapper.updateByPrimaryKeySelective(record);
    }

}
