package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Page;
import com.service.ItemService;

@Controller
@RequestMapping("/items/")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/page/{number}")
	public ModelAndView queryByPage(@PathVariable("number") int pageNum){
		ModelAndView mav = new ModelAndView("page");
		Page page = itemService.findByPage(pageNum, 3);
		mav.addObject("page", page);
		return mav;
	}
}
