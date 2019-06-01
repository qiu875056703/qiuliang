package com.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.swing.border.EmptyBorder;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Service
@interface Component{}
//2.定义	
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Component
@interface Service{}
//说明:spring中的所有Service
public class TestAnnotation2 {
		public static void main(String[] args) {
			//1.获取service注解
			Class<?> cls=Service.class;
			//2.判定Service注解上是否有Component修饰
			boolean flag = cls.isAnnotationPresent(Component.class);
			System.out.println(flag);
		}
}
