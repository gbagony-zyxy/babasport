package edu.wxz.core.dao.mapper.product;

import java.util.List;

import edu.wxz.core.bean.product.Brand;
import edu.wxz.core.query.product.BrandQuery;

public interface BrandMapper {
	
	//List集合
	public List<Brand> getBrandListWithPage(Brand brand);
	
	//获取list集合
	public List<Brand> getBrandList(BrandQuery brandQuery);
	
	//查询总记录数
	public int getBrandCount(Brand brand);
	
	//添加品牌
	public void addBrand(Brand brand);
	
	//删除
	public void deleteBrandBtKey(Integer id);

	//批量删除
	public void deleteBrandByKeys(Integer ... ids);
	
	//修改
	public void updateBrandByKey(Brand brand);
	
	//通过key获取品牌信息
	public Brand getBrandByKey(Integer id);
}
