package com.java.enumpag;
enum Sex{//Sex.class
	MALE("男"),FEMALE("女");//调用有参构造
	private String name;
	private Sex(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}
class Member{
	Sex sex=Sex.MALE;
}
public class TestEnum2 {
	public static void main(String[] args) {
		Member m = new Member();
		String name = m.sex.getName();
		System.out.println(name);
		m.sex=Enum.valueOf(Sex.class, "FEMALE");
		System.out.println(m.sex.getName());
		
	}
	
}
