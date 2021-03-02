package com.zhss.eshop.commodity.service;

import com.zhss.eshop.commodity.domain.dto.PropertyDTO;

import java.util.List;

public interface CommodityPropertyService{


    int deleteByPrimaryKey(Long id);

    int insertSelective(PropertyDTO record) throws Exception;

    PropertyDTO selectByPrimaryKey(Long id) throws Exception;

    int updateByPrimaryKeySelective(PropertyDTO record)throws Exception;

    /**
     * 分页查询商品属性
     * @return 商品属性
     * @throws Exception
     */
    List<PropertyDTO> listPropertiesByPage(Integer page,Integer limit) throws Exception;
}
