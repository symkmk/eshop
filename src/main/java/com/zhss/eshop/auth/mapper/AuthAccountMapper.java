package com.zhss.eshop.auth.mapper;

import com.zhss.eshop.auth.domain.model.AuthAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(AuthAccount record);

    AuthAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthAccount record);
}
