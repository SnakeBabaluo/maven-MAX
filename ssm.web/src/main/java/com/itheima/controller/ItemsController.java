package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 创建日期:  2020/10/18
 * 创建时间:  21:36
 */

@Controller
@RequestMapping("/items")
public class ItemsController {
	@Autowired
	private ItemsService itemsService;

	@RequestMapping("/list")
	public String list(Model model){
		List<Items> all = itemsService.findAll();
		model.addAttribute("items",all);
		return "hello";
	}

}
