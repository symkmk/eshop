package com.zhss.eshop.commodity.service.Impl;

import com.github.pagehelper.PageHelper;
import com.zhss.eshop.commodity.domain.dto.PropertyDTO;
import com.zhss.eshop.commodity.domain.model.CommodityProperty;
import com.zhss.eshop.commodity.mapper.CommodityPropertyMapper;
import com.zhss.eshop.commodity.service.CommodityPropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CommodityPropertyServiceImpl implements CommodityPropertyService{

    @Resource
    private CommodityPropertyMapper commodityPropertyMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commodityPropertyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PropertyDTO propertyDTO) throws Exception {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        propertyDTO.setGmtCreate(dateFormatter.parse(dateFormatter.format(new Date())));
        propertyDTO.setGmtModified(dateFormatter.parse(dateFormatter.format(new Date())));
        CommodityProperty record = propertyDTO.clone(CommodityProperty.class);
        return commodityPropertyMapper.insertSelective(record);
    }

    @Override
    public PropertyDTO selectByPrimaryKey(Long id) throws Exception {
        CommodityProperty commodityProperty = commodityPropertyMapper.selectByPrimaryKey(id);
        return commodityProperty.clone(PropertyDTO.class);
    }

    @Override
    public int updateByPrimaryKeySelective(PropertyDTO propertyDTO)throws Exception {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        propertyDTO.setGmtModified(dateFormatter.parse(dateFormatter.format(new Date())));
        CommodityProperty record = propertyDTO.clone(CommodityProperty.class);
        return commodityPropertyMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 分页查询商品属性
     * @return 商品属性
     */
    @Override
    public List<PropertyDTO> listPropertiesByPage(Integer page,Integer limit) throws Exception {
        PageHelper.startPage(page, limit);
        List<CommodityProperty> propertyDOs = commodityPropertyMapper.listPropertiesByPage();
        List<PropertyDTO> propertyDTOs = new ArrayList<PropertyDTO>(propertyDOs.size());

        for(CommodityProperty propertyDO : propertyDOs) {
            propertyDTOs.add(propertyDO.clone(PropertyDTO.class));
        }

        return propertyDTOs;
    }
}
