package edu.wxz.core.service.product;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.common.page.Pagination;
import edu.wxz.core.bean.product.Brand;
import edu.wxz.core.dao.product.BrandDao;

@Service
@Transactional
public class BrandServiceImp implements BrandService{

	@Resource
	private BrandDao brandDao;
	
	@Transactional(readOnly = true)
	public Pagination getBrandListWithPage(Brand brand){
		//1、起始页 startRow = (pageNo-1)*pageSize
		//2、每页数
		//3、总记录数
		Pagination pagination = new Pagination(brand.getPageNo(),brand.getPageSize(),brandDao.getBrandCount(brand));
		//数据集合
		pagination.setList(brandDao.getBrandListWithPage(brand));
		return pagination;
	}

	@Override
	public void addBrand(Brand brand) {
		brandDao.addBrand(brand);
	}

	@Override
	public void deleteBrandBtKey(Integer id) {
		brandDao.deleteBrandBtKey(id);
	}

	@Override
	public void deleteBrandByKeys(Integer... ids) {
		brandDao.deleteBrandByKeys(ids);
	}

	@Override
	public void updateBrandByKey(Brand brand) {
		brandDao.updateBrandByKey(brand);
	}
}
