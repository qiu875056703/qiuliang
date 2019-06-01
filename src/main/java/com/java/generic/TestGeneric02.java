package com.java.generic;
//容器接口,并指定泛型<T>
interface Container<T>{//Type
	void add(T t);
	T get(int i);
}
//基于数组的容器泛型类
class ArrayContainer<T> implements Container<T>{
	Object array[];
	public ArrayContainer(int i) {
		array=new Object[i];
	}
	@Override
	public void add(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class TestGeneric02 {
	public static void main(String[] args) {
		ArrayContainer<String> c1=new ArrayContainer<>(3);
		c1.add("abc");
		//c1.add(100);只能添加String类型
	}
}
