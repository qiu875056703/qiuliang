package com.java.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Date;

import com.caucho.hessian.io.Hessian2Constants;
import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;

public class TestSerializable3 {
	public static void main(String[] args) throws Exception{
		//1.构建日志对象
		Message sl = new Message();
		sl.setId(1);
		sl.setTitle("abc");
		sl.setContent("ABC");;
		sl.setCreatedTime("123");
		//2.将对象序列化到文件
		OutputStream out= 
				new FileOutputStream("f3.date");
		Hessian2Output ho = new Hessian2Output(out);
		ho.writeObject(sl);
		
		System.out.println("序列化ok");
		ho.flush();
		out.close();
		//3.将对象从文件反序列化
		InputStream in = 
				new FileInputStream("f3.date");
		Hessian2Input hi = new Hessian2Input(in);
		Object obj = hi.readObject();
		//Integer result = in.readInt();
		//System.out.println(result);
		in.close();
		System.out.println(obj);
	}  
}
