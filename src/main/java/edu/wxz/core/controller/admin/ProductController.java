package edu.wxz.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *	商品后台页面
 *	商品列表
 *	商品添加
 *	商品上架 
 */
@Controller
@RequestMapping(value="/product")
public class ProductController {

	//商品列表
	@RequestMapping(value="/list.do",method=RequestMethod.POST)
	public String list(Integer pageNo,String name,Integer brandId,
			@RequestParam(value="isShow",defaultValue="0")Integer isShow,ModelMap model){
		
		
		return "";
	}
}
