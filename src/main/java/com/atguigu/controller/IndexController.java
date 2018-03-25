package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	// 商品属性跳转
	@RequestMapping("goto_attr")
	public String goto_attr() {
		return "attr";
	}
	
	// spu 商品信息跳转
	@RequestMapping("goto_spu")
	public String goto_spu() {
		return "spu";
	}
	
	// 商品首页跳转
	@RequestMapping("index")
	public String index() {
		return "main";
	}
	
}