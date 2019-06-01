package com.java.annotation;
import java.io.File;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.URL;



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Componentscan{
	String value();
}
@Componentscan("com.java.annotation")
class AppConfig{
	
}
public class TestAnnotation3 {
	public static void main(String[] args) {
		//1.获取AppConfig类上的@ComponentScan注解
		Class<?> cls=AppConfig.class;
		Componentscan c = cls.getDeclaredAnnotation(Componentscan.class);
		//2.获取	@ComponentScan注解中value属性的值
		String str=c.value();
		String rep = str.replace(".", "/");
		System.out.println(rep);
		//3.获取value属性对应包下的所有类
		 URL sr = ClassLoader.getSystemResource(rep);
		System.out.println(sr.getPath());
		//获取对应目录的的资源路径
		File file = new File(sr.getPath());
		File[] fs=file.listFiles();
		for (File f : fs) {
			System.out.println(f.getName());
		}
	}
}
