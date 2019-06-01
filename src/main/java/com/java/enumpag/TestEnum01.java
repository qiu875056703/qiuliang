package com.java.enumpag;
enum Gender{//性别(编译完成回生成Gender.class)
	//定义三个枚举实例(类加载时创建)
	MALE,FEMALE,NONE;//默认public static final修饰
	private Gender() {//默认private修饰
		System.out.println("Gender()");
	}
	
}
class Product{//商品对象
	/**性别要求*/
	Gender gender=Gender.NONE;
}
public class TestEnum01 {
	public static void main(String[] args) {
		//1.获取枚举类中的所有实例
		Gender[]genders = Gender.values();
		for (Gender gender : genders) {
			System.out.println(gender);
		}
		//2.为product对象的gender属性赋值
		String genderStr ="MALE";
		Product pro=new Product();
		//3.将字符串转换为指定的枚举类型对象
		pro.gender=Gender.valueOf(genderStr);
	}
}
