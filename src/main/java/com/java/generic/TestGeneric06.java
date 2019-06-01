package com.java.generic;

import java.util.Date;
/**
 * class LinkedContainer<M>{}
 * 
 *
 */
class ObjectFactory{
	//泛型方法
	public static <T>T newInstance(Class<T> cls) throws Exception{
		return cls.newInstance();
	}
}
public class TestGeneric06 {
	public static void main(String[] args) throws Exception {
		Date date =ObjectFactory.newInstance(Date.class);
		System.out.println(date);
	}
}
