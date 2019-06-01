package com.java.oop;

import java.util.Date;

class ObjectFactory{
	//
	public static Object newInstance(Class<?> cls) throws Exception {
		//基于字节码对象创建类的实例对象
		//字节码对象是构建类的实例对下岗的模板对象 
		return cls.newInstance();
	}
}
public class TestClassObject06 {
	public static void main(String[] args) throws Exception {
		Date date=(Date)ObjectFactory.newInstance(Date.class);
		System.out.println(date);
		
	}
}
