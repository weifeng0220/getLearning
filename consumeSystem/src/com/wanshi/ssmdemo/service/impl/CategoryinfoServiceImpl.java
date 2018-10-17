package com.wanshi.ssmdemo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wanshi.ssmdemo.entity.Categoryinfo;
import com.wanshi.ssmdemo.mapper.CategoryinfoMapper;
import com.wanshi.ssmdemo.service.CategoryinfoService;

@Service
public class CategoryinfoServiceImpl implements CategoryinfoService {

	@Resource
	private CategoryinfoMapper categoryinfoMapper;
	
	/**
	 * 查询消费类型
	 */
	@Override
	public List<Categoryinfo> selectCategoryInfos(Categoryinfo categoryinfo) {
		return categoryinfoMapper.selectCategoryInfos(categoryinfo);
	}

}
