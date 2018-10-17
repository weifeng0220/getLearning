package com.wanshi.ssmdemo.service;

import java.util.List;
import java.util.Map;

import com.wanshi.ssmdemo.entity.Consumeinfo;

public interface ConsumeinfoService {
	List<Map<String, Object>> selectConsumeinfos(Map<String, Object> param);
	
	int insert(Consumeinfo record);
}
