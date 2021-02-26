package com.zhss.eshop.purchase.mapper;

import com.zhss.eshop.purchase.domain.model.PurchaseOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(PurchaseOrder record);

    PurchaseOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PurchaseOrder record);
}
