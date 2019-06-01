package com.java.oop.features;
/**定义一个搜索业务对象*/
class DefaultSearchService{
	public Object search(String key){
		System.out.println("search..");
		return "search result by"+key;
	}
}
//搜索业务扩展(基于ocp原则):日志业务对象
class LogDefaultSearchService extends DefaultSearchService{
	@Override
	public Object search(String key) {
		System.out.println(System.nanoTime());
		Object result = super.search(key);
		System.out.println(System.nanoTime());
		return result;
	}
}
//新需求:如何在不修改DefaultSearchService类的情况下,实现Search方法的日志记录
public class TestExtends01 {
	public static void main(String[] args) {
		LogDefaultSearchService ds = new LogDefaultSearchService();
		ds.search("cgb1903");
	}
}
