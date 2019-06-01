package com.test;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.junit.Test;

public class TestTomcat {
	/**
	 * @throws Exception 
	 * 
	 */
	@Test
	public void testTomcat() throws Exception{
		//1.tomcat对象
		Tomcat t=new Tomcat();
			
		//2.构建Connector对象(连接器)
		Connector c=new Connector("HTTP/1.1");
		c.setPort(8080);
		t.getService().addConnector(c);
		//3.启动tomcat
		t.start();
		//4.阻塞当前线程
		t.getServer().await();
	}
}
