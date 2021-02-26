package com.zhss.eshop.customer.mapper;

import com.zhss.eshop.customer.domain.dao.CustomerReturnGoodsWorksheet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerReturnGoodsWorksheetMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(CustomerReturnGoodsWorksheet record);

    CustomerReturnGoodsWorksheet selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerReturnGoodsWorksheet record);
}