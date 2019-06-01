package com.java.oop;
/**
 * 类加载时一定会执行静态代码块吗? 不一定
 * @author UID
 *
 */
class ClassC{
	static int c=100;
	static {
		System.out.println("ClassC.static");
	}
}
class ClassD extends ClassC{
	static int d=200;
	static {
		System.out.println("ClassD.static");
	}
}

public class TestClassObject04 {
	
	public static void main(String[] args) throws Exception {
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		loader.loadClass("com.java.oop.ClassC");
		//Class.forName(name, initialize, loader)
		//true 表示要对类变量初始化静态代码块
		//Class.forName("com.java.oop.ClassC", true, loader);
		//ClassD为被动加载,其内部静态代码块不会被执行
		//System.out.println(ClassD.c);
		//ClassD为主动加载,其内部静态代码块会被执行
		System.out.println(ClassD.d);
	}
}
