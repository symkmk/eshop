package com.zhss.eshop.shopping.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.shopping.mapper.ShoppingCartMapper;
import com.zhss.eshop.shopping.domain.dao.ShoppingCart;
import com.zhss.eshop.shopping.service.ShoppingCartService;
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Resource
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return shoppingCartMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ShoppingCart record) {
        return shoppingCartMapper.insertSelective(record);
    }

    @Override
    public ShoppingCart selectByPrimaryKey(Long id) {
        return shoppingCartMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShoppingCart record) {
        return shoppingCartMapper.updateByPrimaryKeySelective(record);
    }

}
