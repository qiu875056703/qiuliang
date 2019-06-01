package com.java.oop;

public class TestClassObject03 {
	public static void main(String[] args) {
		//获取AppClassLoader
		ClassLoader loader01 = ClassLoader.getSystemClassLoader();
		System.out.println(loader01);
		//获取ExtClassLoader
		ClassLoader loader02 = loader01.getParent();
		System.out.println(loader02);
		//根类加载器BootstrapClassLoader(底层使用c完成)
		ClassLoader loader03 = loader02.getParent();
		System.out.println(loader03);
		//查一查双亲委派模型
	}
}
