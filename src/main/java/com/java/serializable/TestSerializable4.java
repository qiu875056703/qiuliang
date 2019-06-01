package com.java.serializable;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 1)广义的序列化:将对象转化为json格式字符串
 * 2)广义的反序列化:将json格式字符串转化为对象
 * 
 *
 */

public class TestSerializable4 {
	public static void main(String[] args) throws Exception{
		//json格式字符串
		String s1 = "{\"id\":10,\"title\":\"com.tedu\",\"content\":\"cgb1903\"}";
		//构建一个Message对象
		Message m = new Message();
		m.setId(100);
		m.setContent("cgb1903");
		m.setTitle("com.tedu");
		//构建jackson中的对象转换器
		ObjectMapper obj = new ObjectMapper();
		//将对象转换为json格式的字符串(序列化)
		String wv = obj.writeValueAsString(m);
		System.out.println(wv);
		//将串转换为json格式的对象(反序列化)
		Message rv = obj.readValue(wv,Message.class);
		System.out.println(rv);
	}  
}
