package com.zhss.eshop.purchase.mapper;

import com.zhss.eshop.purchase.domain.dao.PurchaseOrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(PurchaseOrderItem record);

    PurchaseOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PurchaseOrderItem record);
}