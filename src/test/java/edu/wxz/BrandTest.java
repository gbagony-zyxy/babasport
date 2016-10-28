package edu.wxz;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.wxz.core.bean.product.Brand;
import edu.wxz.core.common.junit.SpringJunitTest;
import edu.wxz.core.query.product.BrandQuery;
import edu.wxz.core.service.product.BrandService;

public class BrandTest extends SpringJunitTest{

	@Autowired
	private BrandService brandService;
	
	@Test
	public  void test(){
		BrandQuery brandQuery = new BrandQuery();
		//brandQuery.setFields("id");
		//brandQuery.setNameLike(true);
		//brandQuery.setName("行");
		brandQuery.orderById(false);
		
		brandQuery.setPageNo(2);
		brandQuery.setPageSize(2);
		
		List<Brand> lists = brandService.getBrandList(brandQuery);
		for(Brand brand : lists){
			System.out.println(brand);
		}
	}
	
	
	
}
