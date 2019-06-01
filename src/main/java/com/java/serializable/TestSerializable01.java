package com.java.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Date;

class SysLog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7582113134854805016L;
	private Integer id;
	private String username;
	//private Date caeattime;
	/**此方法会在调用对象流的的writeObject方法时执行
	 * @throws Exception */
	private void writeObject(ObjectOutputStream out) throws Exception{
		//1.获取加密对象
		Base64.Encoder encoder = Base64.getEncoder();
		//2.对内容进行加密(encode方法负责加密)
		byte[] array=encoder.encode(username.getBytes());
		//3.将加密结果重新赋值给username
		username=new String(array);
		//4.执行默认序列化
		out.defaultWriteObject();//序列化
	}
	private void readObject(ObjectInputStream in)
			throws IOException, ClassNotFoundException{
			//1.执行默认反序列化
			in.defaultReadObject();
			//2.获取解密对象
			Base64.Decoder decoder=Base64.getDecoder();
			//3.执行解密操作
			byte[] array=decoder.decode(username);
			username=new String(array);
		}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Syslog [id=" + id + ", username=" + username + "]";
	}
	
}
public class TestSerializable01 {
	public static void main(String[] args) throws Exception{
		//1.构建日志对象
		SysLog sl = new SysLog();
		sl.setId(1);
		sl.setUsername("ABC");
		//2.将对象序列化到文件
		ObjectOutputStream out= 
				new ObjectOutputStream(new FileOutputStream("f1.date"));
		out.writeObject(sl);
		out.writeInt(100);
		System.out.println("序列化ok");
		out.close();
		//3.将对象从文件反序列化
		ObjectInputStream in = 
				new ObjectInputStream(new FileInputStream("f1.date"));
		SysLog obj = (SysLog)in.readObject();
		//Integer result = in.readInt();
		//System.out.println(result);
		in.close();
		System.out.println(obj);
	}  
}
