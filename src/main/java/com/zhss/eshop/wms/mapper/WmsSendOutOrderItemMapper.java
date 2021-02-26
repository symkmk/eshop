package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.dao.WmsSendOutOrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsSendOutOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSendOutOrderItem record);

    WmsSendOutOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSendOutOrderItem record);
}