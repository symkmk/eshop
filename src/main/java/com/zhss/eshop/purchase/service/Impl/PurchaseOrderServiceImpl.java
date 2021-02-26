package com.zhss.eshop.purchase.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.purchase.domain.dao.PurchaseOrder;
import com.zhss.eshop.purchase.mapper.PurchaseOrderMapper;
import com.zhss.eshop.purchase.service.PurchaseOrderService;
@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService{

    @Resource
    private PurchaseOrderMapper purchaseOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return purchaseOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PurchaseOrder record) {
        return purchaseOrderMapper.insertSelective(record);
    }

    @Override
    public PurchaseOrder selectByPrimaryKey(Long id) {
        return purchaseOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PurchaseOrder record) {
        return purchaseOrderMapper.updateByPrimaryKeySelective(record);
    }

}
