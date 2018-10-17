package com.wanshi.ssmdemo.service;

import java.util.List;

import com.wanshi.ssmdemo.entity.Categoryinfo;

public interface CategoryinfoService {
	
	 List<Categoryinfo> selectCategoryInfos(Categoryinfo categoryinfo);
}
