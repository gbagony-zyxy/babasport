package edu.wxz;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import edu.wxz.core.bean.ratio.Ratio;
import edu.wxz.core.common.junit.SpringJunitTest;

public class AcquireProps extends SpringJunitTest{

	@Autowired
	ApplicationContext context;
	
	@Test
	public void test(){
		Map<String, String> mapEnv = System.getenv();
		Properties props = System.getProperties();
		for(Iterator<String> it = mapEnv.keySet().iterator();it.hasNext();){
			String key = it.next();
			String value = mapEnv.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("######################################");
		for(Iterator<Object> it = props.keySet().iterator();it.hasNext();){
			Object key = it.next();
			String value = (String) props.get(key);
			System.out.println(key+":"+value);
		}
		Ratio ratio = (Ratio) context.getBean("ratio");
		System.out.println(ratio);
	}
}
