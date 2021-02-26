package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.model.WmsLogisticOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsLogisticOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsLogisticOrder record);

    WmsLogisticOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsLogisticOrder record);
}
