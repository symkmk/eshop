package com.zhss.eshop.shopping.service.Impl;

import com.zhss.eshop.commodity.domain.dto.GoodsSkuDTO;
import com.zhss.eshop.commodity.service.CommodityService;
import com.zhss.eshop.common.util.DateProvider;
import com.zhss.eshop.inventory.service.InventoryService;
import com.zhss.eshop.promotion.domain.dto.PromotionActivityDTO;
import com.zhss.eshop.promotion.service.PromotionService;
import com.zhss.eshop.shopping.domain.dto.ShoppingCartDTO;
import com.zhss.eshop.shopping.domain.dto.ShoppingCartItemDTO;
import com.zhss.eshop.shopping.domain.model.ShoppingCart;
import com.zhss.eshop.shopping.domain.model.ShoppingCartItem;
import com.zhss.eshop.shopping.mapper.ShoppingCartItemMapper;
import com.zhss.eshop.shopping.mapper.ShoppingCartMapper;
import com.zhss.eshop.shopping.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Resource
    private ShoppingCartMapper shoppingCartMapper;

    @Resource
    private ShoppingCartItemMapper shoppingCartItemMapper;

    /**
     * 日期辅助组件
     */
    @Autowired
    private DateProvider dateProvider;

    /**
     * 商品中心对外接口service组件
     */
    @Autowired
    private CommodityService commodityService;

    /**
     * 库存中心对外接口service组件
     */
    @Autowired
    private InventoryService inventoryService;

    /**
     * 促销中心对外接口service组件
     */
    @Autowired
    private PromotionService promotionService;

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

    /**
     * 添加购物车商品条目
     * @param userAccountId 用户账号id
     * @param goodsSkuId 商品sku id
     * @return 处理结果
     */
    @Override
    public void addShoppingCartItem(Long userAccountId, Long goodsSkuId) throws Exception {
        Date currentTime = dateProvider.getCurrentTime();

        // 先查询一下用户的购物车
        ShoppingCart shoppingCartDO = shoppingCartMapper
                .getShoppingCartByUserAccountId(userAccountId);

        // 如果购物车不存在，则新增一个购物车
        if(shoppingCartDO == null) {
            shoppingCartDO = new ShoppingCart();
            shoppingCartDO.setUserAccountId(userAccountId);
            shoppingCartDO.setGmtCreate(currentTime);
            shoppingCartDO.setGmtModified(currentTime);

            shoppingCartMapper.insertSelective(shoppingCartDO);
        }

        // 查询一下购物车中是否存在这个商品sku对应的条目
        ShoppingCartItem shoppingCartItemDO = shoppingCartItemMapper
                .getShoppingCartItemByGoodsSkuId(shoppingCartDO.getId(), goodsSkuId);

        // 如果没有这个商品条目，则新增一个商品条目
        if(shoppingCartItemDO == null) {
            shoppingCartItemDO = new ShoppingCartItem();
            shoppingCartItemDO.setShoppingCartId(shoppingCartDO.getId());
            shoppingCartItemDO.setGoodsSkuId(goodsSkuId);
            shoppingCartItemDO.setPurchaseQuantity(1L);
            shoppingCartItemDO.setGmtCreate(currentTime);
            shoppingCartItemDO.setGmtModified(currentTime);

            shoppingCartItemMapper.insertSelective(shoppingCartItemDO);
        }
        // 如果购物车中已经存在这个商品条目了，则对已有的商品条目的购买数量累加1
        else {
            shoppingCartItemDO.setPurchaseQuantity(
                    shoppingCartItemDO.getPurchaseQuantity() + 1L);
            shoppingCartItemDO.setGmtModified(currentTime);
            shoppingCartItemMapper.updateByPrimaryKeySelective(shoppingCartItemDO);
        }
    }

    /**
     * 查看用户的购物车中的数据
     * @param userAccountId 用户账号id
     * @return 购物车DTO对象
     */
    @Override
    public ShoppingCartDTO getShoppingCartDTOByUserAccountId(Long userAccountId) throws Exception {
        // 根据用户账号id查询一下购物车
        ShoppingCart shoppingCart = shoppingCartMapper
                .getShoppingCartByUserAccountId(userAccountId);
        if(shoppingCart == null) {
            return new ShoppingCartDTO();
        }
        ShoppingCartDTO shoppingCartDTO = shoppingCart.clone(ShoppingCartDTO.class);

        // 查询购物车条目
        List<ShoppingCartItem> shoppingCartItemDOs = shoppingCartItemMapper
                .listShoppingCartItemByCartId(shoppingCart.getId());
        if(shoppingCartItemDOs == null || shoppingCartItemDOs.size() == 0) {
            return shoppingCartDTO;
        }

        List<ShoppingCartItemDTO> shoppingCartItemDTOs = new ArrayList<ShoppingCartItemDTO>();
        shoppingCartDTO.setShoppingCartItemDTOs(shoppingCartItemDTOs);

        // 为购物车条目填充相关的数据
        for(ShoppingCartItem shoppingCartItemDO : shoppingCartItemDOs) {
            ShoppingCartItemDTO item = shoppingCartItemDO.clone(ShoppingCartItemDTO.class);
            setGoodsRelatedData(item);
            setStockRelatedData(item);
            setPromotionRelatedData(item);
            shoppingCartItemDTOs.add(item);
        }

        return shoppingCartDTO;
    }

    /**
     * 给购物车条目设置商品相关的数据
     * @throws Exception
     */
    private void setGoodsRelatedData(ShoppingCartItemDTO item) throws Exception {
        GoodsSkuDTO goodsSkuDTO = commodityService.getGoodsSkuById(
                item.getGoodsSkuId());

        item.setGoodsId(goodsSkuDTO.getGoodsId());
        item.setGoodsHeight(goodsSkuDTO.getGoodsHeight());
        item.setGoodsLength(goodsSkuDTO.getGoodsLength());
        item.setGoodsName(goodsSkuDTO.getGoodsName());
        item.setGoodsSkuCode(goodsSkuDTO.getGoodsSkuCode());
        item.setGoodsWidth(goodsSkuDTO.getGoodsWidth());
        item.setGrossWeight(goodsSkuDTO.getGrossWeight());
        item.setSalePrice(goodsSkuDTO.getSalePrice());
        item.setSaleProperties(goodsSkuDTO.getSaleProperties());
    }

    /**
     * 给购物车条目设置库存相关的数据
     * @param item 购物车条目
     * @throws Exception
     */
    private void setStockRelatedData(ShoppingCartItemDTO item) throws Exception {
        Long saleStockQuantity = inventoryService.getSaleStockQuantity(
                item.getGoodsSkuId());
        item.setSaleStockQuantity(saleStockQuantity);
    }

    /**
     * 给购物车条目设置促销相关的数据
     * @param item 购物车条目
     * @throws Exception
     */
    private void setPromotionRelatedData(ShoppingCartItemDTO item) throws Exception {
        List<PromotionActivityDTO> promotionActivityDTOs = promotionService
                .listByGoodsId(item.getGoodsId());
        item.setPromotionActivityDTOs(promotionActivityDTOs);
    }

}
