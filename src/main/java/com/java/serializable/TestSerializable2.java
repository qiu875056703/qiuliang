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

public class TestSerializable2 {
	public static void main(String[] args) throws Exception{
		//1.构建日志对象
		Message sl = new Message();
		sl.setId(1);
		sl.setTitle("abc");
		sl.setContent("ABC");;
		sl.setCreatedTime("123");
		//2.将对象序列化到文件
		ObjectOutputStream out= 
				new ObjectOutputStream(new FileOutputStream("f2.date"));
		out.writeObject(sl);
		out.writeInt(100);
		System.out.println("序列化ok");
		out.close();
		//3.将对象从文件反序列化
		ObjectInputStream in = 
				new ObjectInputStream(new FileInputStream("f2.date"));
		Object obj = in.readObject();
		//Integer result = in.readInt();
		//System.out.println(result);
		in.close();
		System.out.println(obj);
	}  
}
