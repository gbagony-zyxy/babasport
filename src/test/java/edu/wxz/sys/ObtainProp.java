package edu.wxz.sys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;

public class ObtainProp {

	@Test
	public void test(){
		Properties props = System.getProperties();
		Enumeration<Object> e = props.keys();
		while(e.hasMoreElements()){
			String key = (String) e.nextElement();
		 	String value = props.getProperty(key);
		 	System.out.println("key:"+key+"  value:"+value);
		}
		
	}
	
	@Test
	public void test1(){
		Map<String, String> map = System.getenv();
		for(String key : map.keySet()){
			System.out.println(key+"="+map.get(key));
		}
	}
	
	@Test
	public void test3(){
		System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
		System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
		System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
	}
	
	@Test
	public void test4() throws IOException{
		Runtime.getRuntime().exec("notepad");
		Runtime.getRuntime().exec("cmd /c start Winword");
	}
	
	@Test
	public void test2(){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while((line = br.readLine())!=null){
				System.out.println(line);
				if(line.equals("bye")){
					System.exit(0);
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
