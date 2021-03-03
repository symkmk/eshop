package com.zhss.eshop.shopping.service.Impl;

import com.zhss.eshop.common.util.DateProvider;
import com.zhss.eshop.shopping.domain.model.ShoppingCartItem;
import com.zhss.eshop.shopping.mapper.ShoppingCartItemMapper;
import com.zhss.eshop.shopping.service.ShoppingCartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ShoppingCartItemServiceImpl implements ShoppingCartItemService{

    @Resource
    private ShoppingCartItemMapper shoppingCartItemMapper;

    /**
     * 日期辅助组件
     */
    @Autowired
    private DateProvider dateProvider;

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

    /**
     * 更新购物车条目的购买数量
     * @param id 购物车条目id
     * @param purchaseQuantity 购买数量
     * @return 处理结果
     */
    @Override
    public void updatePurchaseQuantity(Long id, Long purchaseQuantity) throws Exception {
        ShoppingCartItem item = new ShoppingCartItem();
        item.setId(id);
        item.setPurchaseQuantity(purchaseQuantity);
        item.setGmtModified(dateProvider.getCurrentTime());
        shoppingCartItemMapper.updateByPrimaryKeySelective(item);
    }

}
