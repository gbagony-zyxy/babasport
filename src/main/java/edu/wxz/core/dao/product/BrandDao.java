package edu.wxz.core.dao.product;

import java.util.List;

import edu.wxz.core.bean.product.Brand;

public interface BrandDao {
	
	//List集合
	public List<Brand> getBrandListWithPage(Brand brand);
	
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
}
