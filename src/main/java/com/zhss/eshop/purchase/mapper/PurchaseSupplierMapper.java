package com.zhss.eshop.purchase.mapper;

import com.zhss.eshop.purchase.domain.dao.PurchaseSupplier;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseSupplierMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(PurchaseSupplier record);

    PurchaseSupplier selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PurchaseSupplier record);
}