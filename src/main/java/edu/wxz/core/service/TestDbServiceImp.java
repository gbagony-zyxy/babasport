package edu.wxz.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.wxz.core.bean.TestDB;
import edu.wxz.core.dao.TestDBDao;

//在类上添加事物,则类对应的方法都具有事务，对于有些方法则可以添加readOnly属性

@Service("testDbService")
@Transactional
public class TestDbServiceImp implements TestDbService{

	@Autowired
	private TestDBDao testDBDao;
	
	@Transactional(readOnly = true)
	public void query(){
		
	}
	
	@Override
	public void addTestDb(TestDB testDB) {
		testDBDao.addTestDb(testDB);
		
		//抛出异常则事务不会提交,默认提交
		throw new RuntimeException();
	}

}
