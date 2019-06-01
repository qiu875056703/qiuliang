package com.java.generic;

import java.util.Date;

public class TestGeneric7 {
	public static void main(String[] args) throws Exception {
		Class<Date> c1=Date.class;
		//当泛型类型不确定时可直接使用?替代
		Class<?> c2=Class.forName("java.util.Date");
	}
}
