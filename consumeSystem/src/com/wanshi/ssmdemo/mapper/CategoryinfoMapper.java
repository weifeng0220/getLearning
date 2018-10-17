package com.wanshi.ssmdemo.mapper;

import java.util.List;

import com.wanshi.ssmdemo.entity.Categoryinfo;

public interface CategoryinfoMapper {
    int deleteByPrimaryKey(Integer categoryid);

    int insert(Categoryinfo record);

    int insertSelective(Categoryinfo record);

    Categoryinfo selectByPrimaryKey(Integer categoryid);

    int updateByPrimaryKeySelective(Categoryinfo record);

    int updateByPrimaryKey(Categoryinfo record);
    /**
	 * 查询消费类型
	 */
    List<Categoryinfo> selectCategoryInfos(Categoryinfo categoryinfo);
}