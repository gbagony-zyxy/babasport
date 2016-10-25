package edu.wxz.core.service.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.common.page.Pagination;
import edu.wxz.core.bean.product.Brand;
import edu.wxz.core.dao.mapper.product.BrandMapper;

@Service
@Transactional
public class BrandServiceImp implements BrandService{

	@Autowired
	private BrandMapper brandMapper;
	
	@Transactional(readOnly = true)
	public Pagination getBrandListWithPage(Brand brand){
		//1、起始页 startRow = (pageNo-1)*pageSize
		//2、每页数
		//3、总记录数
		System.out.println(brandMapper);
		Pagination pagination = new Pagination(brand.getPageNo(),brand.getPageSize(),brandMapper.getBrandCount(brand));
		//数据集合
		pagination.setList(brandMapper.getBrandListWithPage(brand));
		return pagination;
	}

	@Override
	public void addBrand(Brand brand) {
		brandMapper.addBrand(brand);
	}

	@Override
	public void deleteBrandBtKey(Integer id) {
		brandMapper.deleteBrandBtKey(id);
	}

	@Override
	public void deleteBrandByKeys(Integer... ids) {
		brandMapper.deleteBrandByKeys(ids);
	}

	@Override
	public void updateBrandByKey(Brand brand) {
		brandMapper.updateBrandByKey(brand);
	}

	@Override
	public Brand getBrandByKey(Integer id) {
		return brandMapper.getBrandByKey(id);
	}
}
