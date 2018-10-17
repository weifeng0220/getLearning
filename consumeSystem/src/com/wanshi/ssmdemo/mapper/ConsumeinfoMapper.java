package com.wanshi.ssmdemo.mapper;

import java.util.List;
import java.util.Map;

import com.wanshi.ssmdemo.entity.Consumeinfo;

public interface ConsumeinfoMapper {
    int deleteByPrimaryKey(Integer consumeid);

    int insert(Consumeinfo record);

    int insertSelective(Consumeinfo record);

    Consumeinfo selectByPrimaryKey(Integer consumeid);

    int updateByPrimaryKeySelective(Consumeinfo record);

    int updateByPrimaryKey(Consumeinfo record);
    
    List<Map<String, Object>> getConsumeinfos(Map<String, Object> param);
}