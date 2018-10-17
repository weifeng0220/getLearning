package com.wanshi.ssmdemo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wanshi.ssmdemo.entity.Categoryinfo;
import com.wanshi.ssmdemo.entity.Consumeinfo;
import com.wanshi.ssmdemo.mapper.CategoryinfoMapper;
import com.wanshi.ssmdemo.mapper.ConsumeinfoMapper;
import com.wanshi.ssmdemo.service.ConsumeinfoService;

@Service
@Transactional
public class ConsumeinfoServiceImpl implements ConsumeinfoService {

	@Resource
	private ConsumeinfoMapper consumeinfoMapper;
	
	@Resource
	private CategoryinfoMapper categoryinfoMapper;

	/**
	 * 查询消费信息列表
	 */
	@Override
	public List<Map<String, Object>> selectConsumeinfos(Map<String, Object> param) {
		List<Categoryinfo> categoryinfos = categoryinfoMapper.selectCategoryInfos(null);
		List<Map<String, Object>> maps = consumeinfoMapper.getConsumeinfos(param);
		for (Map<String, Object> map : maps) {
			map.put("consumeDate", map.get("consumeDate").toString().substring(0,10));
			for (Categoryinfo categoryinfo : categoryinfos) {
				if (map.get("consumeType")==categoryinfo.getCategoryid()) {
					map.put("consumeType", categoryinfo.getCategoryname());
				}
			}
		}
		return maps;
	}

	/**
	 * 消费信息新增
	 */
	@Override
	public int insert(Consumeinfo record) {
		return consumeinfoMapper.insert(record);
	}
	
	
}
