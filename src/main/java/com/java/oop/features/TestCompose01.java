package com.java.oop.features;
final class DefaultMailService{
	void sendMail(String msg){
		System.out.println("send"+msg);
	}
}
class LogDefaultMailService{
	private DefaultMailService mailService;//=new DefaultMailService();
	//通过构造方法为属性初始化
	public LogDefaultMailService(DefaultMailService mailService ) {
		this.mailService=mailService;
	}
	public void sendMail(String msg){
		System.out.println(System.nanoTime());
		mailService.sendMail(msg);
		System.out.println(System.nanoTime());
	}
}
/**演示组合特性应用*/
public class TestCompose01 {
	public static void main(String[] args) {
		DefaultMailService defaultMailService = new DefaultMailService();
		LogDefaultMailService ldss = new LogDefaultMailService(defaultMailService);
		ldss.sendMail("123456");
	}
}
