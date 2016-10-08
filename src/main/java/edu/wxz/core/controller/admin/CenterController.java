package edu.wxz.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/control")
public class CenterController {

	// 跳转入口页面
	@RequestMapping(value = "/index.do")
	public String index() {
		return "index";
	}

	// 跳转头部页面
	@RequestMapping(value = "/top.do")
	public String top() {
		return "top";
	}

	// 跳转身体页面
	@RequestMapping(value = "/main.do")
	public String main() {
		return "main";
	}

	// 跳转左部菜单
	@RequestMapping(value = "/left.do")
	public String left() {
		return "left";
	}

	// 跳转右部菜单
	@RequestMapping(value = "/right.do")
	public String right() {
		return "right";
	}
}
