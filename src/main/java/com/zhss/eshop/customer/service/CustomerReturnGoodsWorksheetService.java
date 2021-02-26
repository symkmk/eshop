package com.zhss.eshop.customer.service;

import com.zhss.eshop.customer.domain.model.CustomerReturnGoodsWorksheet;
public interface CustomerReturnGoodsWorksheetService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(CustomerReturnGoodsWorksheet record);

    CustomerReturnGoodsWorksheet selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerReturnGoodsWorksheet record);

}
