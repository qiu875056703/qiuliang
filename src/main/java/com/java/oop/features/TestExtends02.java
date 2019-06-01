package com.java.oop.features;

import java.util.LinkedHashMap;
//构建基于LRU算法的缓存对象（简易）
//缓存满了要淘汰长时间不访问的对象
class LruCache<K,V> extends LinkedHashMap<K,V>{
	LinkedHashMap<K,V> removeElements=new LinkedHashMap<K,V>();
	private int maxCap;//记录最大容量
	public LruCache(int cap) {
		super(cap,0.75f,true);//调用父类有参构造
		this.maxCap=cap;
	}
	//当我们执行put方法时,每次都会调用此方法
	//方法返回值为true时表示满了,可以移除数据
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		
		boolean flag= size()>maxCap;
		if (flag) {
			removeElements.put(eldest.getKey(),eldest.getValue());
		}
		return flag;
	}
}
public class TestExtends02 {
	public static void main(String[] args) {
		LruCache<String,Object> cache = new LruCache<>(3);
		cache.put("A", 100);
		cache.put("B", 200);
		cache.put("C", 300);
		cache.put("D", 400);
		cache.put("E", 500);
		cache.get("D");
		System.out.println(cache);
		System.out.println(cache.removeElements);
	}
}
