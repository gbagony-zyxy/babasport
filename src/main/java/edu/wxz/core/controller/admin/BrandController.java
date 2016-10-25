package edu.wxz.core.controller.admin;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.common.page.Pagination;
import edu.wxz.core.bean.product.Brand;
import edu.wxz.core.service.product.BrandService;

@Controller
@RequestMapping(value="/brand")
public class BrandController {

	@Autowired
	private BrandService brandService;

	// 品牌列表页面(查询)
	@RequestMapping(value = "/list.do")
	public String brandList(String name, Integer isDisplay, Integer pageNo, ModelMap modelMap) {
		Brand brand = new Brand();
		
		StringBuffer params = new StringBuffer();
		
		if (StringUtils.isNotBlank(name)) {
			brand.setName(name);
			params.append("name=").append(name);
		}
		if (null != isDisplay) {
			brand.setIsDisplay(isDisplay);
			params.append("&").append("isDisplay=").append(isDisplay);
		} else {
			brand.setIsDisplay(1);
			params.append("&").append("isDisplay=").append(1);

		}

		// 页号
		brand.setPageNo(Pagination.cpn(pageNo));

		// 每页数
		brand.setPageSize(5);
		// 分页
		Pagination pagination = brandService.getBrandListWithPage(brand);

		String url = "/list.do";
		pagination.pageView(url, params.toString());

		modelMap.addAttribute("pagination", pagination);
		modelMap.addAttribute("isDisplay", isDisplay);
		modelMap.addAttribute("name", name);

		return "brand/list";
	}

	// 跳转商品添加页面
	@RequestMapping(value = "/toAdd.do")
	public String toAdd() {
		return "brand/add";
	}

	//添加品牌
	@RequestMapping(value="/add.do")
	public String add(Brand brand){
		brandService.addBrand(brand);
		return "redirect:/brand/list.do";
	}
	
	// 删除品牌,回显内容
	@RequestMapping(value = "/delete.do")
	public String delBrand(Integer id, String name, String isDisplay, ModelMap model) {
		brandService.deleteBrandBtKey(id);

		if(StringUtils.isNotBlank(name)){
			model.addAttribute("name", name);
		}
		if(null != isDisplay){
			model.addAttribute("isDisplay", isDisplay);
		}
		
		return "redirect:/brand/list.do";
	}
	
	// 批量删除品牌,回显内容
	@RequestMapping(value = "/deletes.do")
	public String delBrands(Integer[] ids, String name, String isDisplay, ModelMap model) {
		brandService.deleteBrandByKeys(ids);

		if (StringUtils.isNotBlank(name)) {
			model.addAttribute("name", name);
		}
		if (null != isDisplay) {
			model.addAttribute("isDisplay", isDisplay);
		}

		return "redirect:/brand/list.do";
	}
}
