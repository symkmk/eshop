package com.zhss.eshop.order.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.order.domain.dao.OrderReturnGoodsApply;
import com.zhss.eshop.order.mapper.OrderReturnGoodsApplyMapper;
import com.zhss.eshop.order.service.OrderReturnGoodsApplyService;
@Service
public class OrderReturnGoodsApplyServiceImpl implements OrderReturnGoodsApplyService{

    @Resource
    private OrderReturnGoodsApplyMapper orderReturnGoodsApplyMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderReturnGoodsApplyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(OrderReturnGoodsApply record) {
        return orderReturnGoodsApplyMapper.insertSelective(record);
    }

    @Override
    public OrderReturnGoodsApply selectByPrimaryKey(Long id) {
        return orderReturnGoodsApplyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderReturnGoodsApply record) {
        return orderReturnGoodsApplyMapper.updateByPrimaryKeySelective(record);
    }

}
