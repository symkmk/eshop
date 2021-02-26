package com.zhss.eshop.shopping.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.shopping.domain.dao.ShoppingCartItem;
import com.zhss.eshop.shopping.mapper.ShoppingCartItemMapper;
import com.zhss.eshop.shopping.service.ShoppingCartItemService;
@Service
public class ShoppingCartItemServiceImpl implements ShoppingCartItemService{

    @Resource
    private ShoppingCartItemMapper shoppingCartItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return shoppingCartItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ShoppingCartItem record) {
        return shoppingCartItemMapper.insertSelective(record);
    }

    @Override
    public ShoppingCartItem selectByPrimaryKey(Long id) {
        return shoppingCartItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShoppingCartItem record) {
        return shoppingCartItemMapper.updateByPrimaryKeySelective(record);
    }

}
