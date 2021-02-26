package com.zhss.eshop.customer.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.customer.mapper.CustomerReturnGoodsWorksheetMapper;
import com.zhss.eshop.customer.domain.dao.CustomerReturnGoodsWorksheet;
import com.zhss.eshop.customer.service.CustomerReturnGoodsWorksheetService;
@Service
public class CustomerReturnGoodsWorksheetServiceImpl implements CustomerReturnGoodsWorksheetService{

    @Resource
    private CustomerReturnGoodsWorksheetMapper customerReturnGoodsWorksheetMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return customerReturnGoodsWorksheetMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CustomerReturnGoodsWorksheet record) {
        return customerReturnGoodsWorksheetMapper.insertSelective(record);
    }

    @Override
    public CustomerReturnGoodsWorksheet selectByPrimaryKey(Long id) {
        return customerReturnGoodsWorksheetMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerReturnGoodsWorksheet record) {
        return customerReturnGoodsWorksheetMapper.updateByPrimaryKeySelective(record);
    }

}
