package edu.wxz.core.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.wxz.core.bean.ratio.Ratio;

@Controller
public class ProductController{

	@Autowired
	private Ratio ratio;
	
	@RequestMapping(value = "/test/springmvc.do")
	public String test(String name, Date birthday){
		
		System.out.println(birthday);
		System.out.println(ratio.getPopulateRatio().getRead());
		System.out.println(ratio.getPopulateRatio().getLike());
		return "";
	}

	//局部日期转换配置
	/*@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {
		DateFormat dateFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}*/
}
