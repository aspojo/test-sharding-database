package com.logbug.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.logbug.model.TOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TOrderDao extends BaseMapper<TOrder> {
}