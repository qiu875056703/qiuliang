package com.java.oop;
class ClassCC{
	//静态代码块在类加载时可以初始化,但加入有多个静态成员,则会按编写顺序执行
	static{
		System.out.println("static{}");
	}
	static ClassCC instance=new ClassCC();
	int a;
	public ClassCC(){
		a=200;
		System.out.println("ClassCC()");
		
	}
	
	//实例代码块(每次构建对象都会执行)
	{
		a=100;
		System.out.println("{}");}
}
public class TestClassObject08 {
	public static void main(String[] args) {
		ClassCC c1=ClassCC.instance;
		ClassCC c2=new ClassCC();
	}
}
