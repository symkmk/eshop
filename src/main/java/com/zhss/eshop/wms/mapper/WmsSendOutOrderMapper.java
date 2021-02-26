package com.zhss.eshop.wms.mapper;

import com.zhss.eshop.wms.domain.model.WmsSendOutOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmsSendOutOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WmsSendOutOrder record);

    WmsSendOutOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsSendOutOrder record);
}
