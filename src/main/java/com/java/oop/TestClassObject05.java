package com.java.oop;

import java.util.HashMap;
import java.util.Map;

class ClassE{
	static Map<String,Object> pool = new HashMap<>();
	static ClassE instance = new ClassE();
	public ClassE(){
		pool.put("A","100");
		pool.put("B","200");
	}
}
public class TestClassObject05 {
	public static void main(String[] args) {
		System.out.println(ClassE.pool);
	}
}
