package com.zhss.eshop.comment.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.comment.domain.dao.CommentInfo;
import com.zhss.eshop.comment.mapper.CommentInfoMapper;
import com.zhss.eshop.comment.service.CommentInfoService;
@Service
public class CommentInfoServiceImpl implements CommentInfoService{

    @Resource
    private CommentInfoMapper commentInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commentInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommentInfo record) {
        return commentInfoMapper.insertSelective(record);
    }

    @Override
    public CommentInfo selectByPrimaryKey(Long id) {
        return commentInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommentInfo record) {
        return commentInfoMapper.updateByPrimaryKeySelective(record);
    }

}
