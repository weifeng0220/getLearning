package com.wanshi.ssmdemo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wanshi.ssmdemo.entity.Consumeinfo;
import com.wanshi.ssmdemo.service.ConsumeinfoService;
/**
 * 消费信息controller
 * @author Administrator
 *
 */
@Controller
public class ConsumeinfoController {

	/**
	 * 自动注入ConsumeinfoService
	 */
	@Resource
	private ConsumeinfoService consumeinfoService;
	
	/**
	 * 消费列表查询controller
	 * @param consumename 
	 * @param beginPrice
	 * @param endPrice
	 * @return
	 */
	@RequestMapping("/getConsumeinfos.action")
	public ModelAndView getConsumeinfos(String consumename,String beginPrice,String endPrice){
		ModelAndView view = new ModelAndView();
		Map<String, Object> map = new HashMap<>();
		map.put("consumename", (consumename==null||consumename.equals(""))?null:consumename);
		map.put("beginPrice", (beginPrice==null||beginPrice.equals(""))?null:beginPrice);
		map.put("endPrice", (endPrice==null||endPrice.equals(""))?null:endPrice);
		List<Map<String, Object>> consumeinfos = consumeinfoService.selectConsumeinfos(map);
		view.addObject("consumeinfos", consumeinfos);
		view.setViewName("consume_list");
		return view;
	}
	/**
	 * 消费信息新增的方法
	 * @param consumeinfo
	 * @return
	 */
	@RequestMapping("/add.action")
	public ModelAndView add(Consumeinfo consumeinfo){
		ModelAndView view = new ModelAndView();
		int i = consumeinfoService.insert(consumeinfo);
		if (i>0) {
			view.setViewName("redirect:getConsumeinfos.action");
		}else{
			view.addObject("errormessage", "新增失败");
			view.setViewName("consume_add");
		}
		return view;
	}
}
