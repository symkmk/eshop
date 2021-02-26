package com.zhss.eshop.order.mapper;

import com.zhss.eshop.order.domain.model.OrderReturnGoodsApply;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderReturnGoodsApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderReturnGoodsApply record);

    OrderReturnGoodsApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderReturnGoodsApply record);
}
