package com.zhss.eshop.pay.mapper;

import com.zhss.eshop.pay.domain.dao.PayTransaction;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PayTransactionMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(PayTransaction record);

    PayTransaction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayTransaction record);
}