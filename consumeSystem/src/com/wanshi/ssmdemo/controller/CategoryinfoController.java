package com.wanshi.ssmdemo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.wanshi.ssmdemo.entity.Categoryinfo;
import com.wanshi.ssmdemo.service.CategoryinfoService;

/**
 * 消费类型controller
 * @author Administrator
 *
 */
@Controller
public class CategoryinfoController {

	@Resource
	private CategoryinfoService categoryinfoService;
	
	/**
	 * 查询消费类型列表
	 * @param request
	 * @return
	 */
	@RequestMapping("/getcategoryList.action")  
    public String getcategoryList(HttpServletRequest request){  
		List<Categoryinfo> categoryinfos = categoryinfoService.selectCategoryInfos(null);
		request.setAttribute("categoryinfos", categoryinfos);
        return "consume_add";  
    }  
	
	
}
