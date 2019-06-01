package com.java.oop.features;
/**
 * LinkedHashMap 是一个特殊的HashMap,
 * 在HashMap的基础之上添加了一个链表
 * 1)记录元素添加顺序
 * 2)记录元素访问顺序
 */
import java.util.LinkedHashMap;

public class TestLinkedHashMap01 {
	public static void main(String[] args) {
		LinkedHashMap<String,Object> map=
		//new LinkedHashMap<String,Object>();
		new LinkedHashMap<String,Object>();	
		map.put("A", 100);
		map.put("D", 200);
		map.put("C", 300);
		map.put("B", 400);
		map.get("D");
		map.get("A");
		System.out.println(map);
	}
}
