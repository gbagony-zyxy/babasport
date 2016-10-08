package edu.wxz.core.common.web;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

/**
 * 	异步返回各种格式
 * 	json
 * 	xml
 * 	text
 * */
public class ResponseUtils {
	
	/** 发送指定格式的数据*/
	public static void sender(HttpServletResponse response, String contentType , String text){
		try {
			response.getWriter().write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/** 发送json格式的数据*/
	public static void senderJson(HttpServletResponse response , String text){
		sender(response, "application/json;charset=utf-8", text);
	}
	
	/** 发送xml格式的数据*/
	public static void senderXml(HttpServletResponse response , String text){
		sender(response, "text/xml;charset=utf-8", text);
	}
	
	/** 发送text格式的数据*/
	public static void senderText(HttpServletResponse response , String text){
		sender(response, "text/plain;charset=utf-8", text);
	}
}
