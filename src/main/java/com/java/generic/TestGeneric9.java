 package com.java.generic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestGeneric9 {
	public static void main(String[] args) throws Exception{
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		//list.add(100);将100存储到list集合(借助反射),输出list集合内容
		//list.add(0, 100);
		//1)获取字节码对象(此对象时应用反射的入口)
		Class<?> cls = list.getClass();
		//2)基于字节码对象获取 add方法对象
		//Method method = cls.getDeclaredMethod("add",int.class,Object.class);
		//泛型擦除  获取add方法
		Method method = cls.getDeclaredMethod("add",int.class,Object.class);
		//3)执行list集合的add方法将100添加到集合
		method.invoke(list,0,100);
		System.out.println(list);
	}
}


