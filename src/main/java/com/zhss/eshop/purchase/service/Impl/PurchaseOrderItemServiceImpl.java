package com.zhss.eshop.purchase.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.purchase.domain.model.PurchaseOrderItem;
import com.zhss.eshop.purchase.mapper.PurchaseOrderItemMapper;
import com.zhss.eshop.purchase.service.PurchaseOrderItemService;
@Service
public class PurchaseOrderItemServiceImpl implements PurchaseOrderItemService{

    @Resource
    private PurchaseOrderItemMapper purchaseOrderItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return purchaseOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PurchaseOrderItem record) {
        return purchaseOrderItemMapper.insertSelective(record);
    }

    @Override
    public PurchaseOrderItem selectByPrimaryKey(Long id) {
        return purchaseOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PurchaseOrderItem record) {
        return purchaseOrderItemMapper.updateByPrimaryKeySelective(record);
    }

}
