package com.zhss.eshop.finance.mapper;

import com.zhss.eshop.finance.domain.dao.FinanceReturnGoodsRefundDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FinanceReturnGoodsRefundDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(FinanceReturnGoodsRefundDetail record);

    FinanceReturnGoodsRefundDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FinanceReturnGoodsRefundDetail record);
}