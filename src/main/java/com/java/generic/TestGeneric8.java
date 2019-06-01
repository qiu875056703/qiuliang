package com.java.generic;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric8 {
	static void doprint(List<? extends Number> list){
		Number number = list.get(0);
		System.out.println(number);
	}
	public static void main(String[] args) throws Exception {
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		doprint(list);
	}
}
