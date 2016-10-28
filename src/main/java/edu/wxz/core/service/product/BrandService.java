package edu.wxz.core.service.product;

import java.util.List;

import cn.itcast.common.page.Pagination;
import edu.wxz.core.bean.product.Brand;
import edu.wxz.core.query.product.BrandQuery;

public interface BrandService {

	public Pagination getBrandListWithPage(Brand brand);

	//获取list集合
	public List<Brand> getBrandList(BrandQuery brandQuery); 
	
	// 添加品牌
	public void addBrand(Brand brand);

	// 删除
	public void deleteBrandBtKey(Integer id);

	// 批量删除
	public void deleteBrandByKeys(Integer... ids);

	// 修改
	public void updateBrandByKey(Brand brand);
	
	//通过key获取品牌信息
	public Brand getBrandByKey(Integer id);
}
