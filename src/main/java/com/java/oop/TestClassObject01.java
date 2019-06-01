package com.java.oop;

import java.util.Date;

/**
 * 字节码对象应用分析
 * JVM参数配置:跟踪类的加载过程
 * -XX:+TraceClassLoading
 */
public class TestClassObject01 {
	public static void main(String[] args) throws Exception {
		//1.获取类的字节码对象1
		Class<Date> d1 = Date.class;
		//2.获取累的字节码对象2
		Class<?> d2= Class.forName("java.util.Date");
		//3.获取累的字节码对象3
		Class<?> d3= new Date().getClass();
	}
}
