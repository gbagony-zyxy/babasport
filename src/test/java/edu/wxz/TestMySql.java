package edu.wxz;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.wxz.core.bean.TestDB;
import edu.wxz.core.service.TestDbService;

public class TestMySql{

	private TestDbService testDbService;
	
	@Before
	public void init(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		testDbService=(TestDbService) context.getBean("testDbService");
	}
	
	@Test
	public void testAdd(){
		TestDB db = new TestDB();
		db.setName("hello");
		testDbService.addTestDb(db);
	}
	
}
