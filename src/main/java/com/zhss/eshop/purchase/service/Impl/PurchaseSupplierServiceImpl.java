package com.zhss.eshop.purchase.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.purchase.domain.model.PurchaseSupplier;
import com.zhss.eshop.purchase.mapper.PurchaseSupplierMapper;
import com.zhss.eshop.purchase.service.PurchaseSupplierService;
@Service
public class PurchaseSupplierServiceImpl implements PurchaseSupplierService{

    @Resource
    private PurchaseSupplierMapper purchaseSupplierMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return purchaseSupplierMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PurchaseSupplier record) {
        return purchaseSupplierMapper.insertSelective(record);
    }

    @Override
    public PurchaseSupplier selectByPrimaryKey(Long id) {
        return purchaseSupplierMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PurchaseSupplier record) {
        return purchaseSupplierMapper.updateByPrimaryKeySelective(record);
    }

}
