package com.java.generic;

import java.util.ArrayList;
import java.util.List;

//泛型方法:<泛型>方法返回值类型
class DefaultSqlSession{
	//泛型方法
	public <T>T getMapper(Class<T> cls){
		return null;
	}
}
interface BeanFactory{
	//泛型方法
	public <T>T getBean(Class<T> cls);
}
class CollectionUtil{
	//静态方法不能用泛型类
	static <T>T Convert(List<T> list){
		return null;
	}
	static <T>void Print(List<T> list){
		System.out.println(list);
	}
}
public class TestGeneric05 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		CollectionUtil.Print(list);
	}
}
