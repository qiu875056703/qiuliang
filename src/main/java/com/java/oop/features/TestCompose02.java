package com.java.oop.features;

import java.util.LinkedHashMap;

class MyLruCache{
	//has a
	private LinkedHashMap<String, Object> cache;
	@SuppressWarnings("serial")
	public MyLruCache(int cap){
		//匿名内部类(这里的父类为LinkedHashMap)
		cache=new LinkedHashMap<String,Object>(cap, 0.75f,true){
		@Override
		protected boolean removeEldestEntry(java.util.Map.Entry<String, Object> eldest) {
			
			return size()>cap;
		} 
		};
		
	}
	public void put(String key,Object value){
		cache.put(key, value);
	}
	public Object get(String key){
		return cache.get(key);
	}
	@Override
	public String toString() {
		return "MyLruCache [cache=" + cache + "]";
	}
	
}
public class TestCompose02 {
	public static void main(String[] args) {
		MyLruCache cache = new MyLruCache(3);
		cache.put("A", 100);
		cache.put("B", 100);
		cache.put("C", 100);
		cache.put("D", 100);
		System.out.println(cache);
	}
}
