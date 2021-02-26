package com.zhss.eshop.comment.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhss.eshop.comment.domain.dao.CommentAggregate;
import com.zhss.eshop.comment.mapper.CommentAggregateMapper;
import com.zhss.eshop.comment.service.CommentAggregateService;
@Service
public class CommentAggregateServiceImpl implements CommentAggregateService{

    @Resource
    private CommentAggregateMapper commentAggregateMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commentAggregateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommentAggregate record) {
        return commentAggregateMapper.insertSelective(record);
    }

    @Override
    public CommentAggregate selectByPrimaryKey(Long id) {
        return commentAggregateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommentAggregate record) {
        return commentAggregateMapper.updateByPrimaryKeySelective(record);
    }

}
