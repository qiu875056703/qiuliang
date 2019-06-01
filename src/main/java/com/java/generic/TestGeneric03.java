package com.java.generic;
interface Task<Parm,Result>{//Map<K,V>
	Result execute(Parm parm);
}
class Converttask implements Task<String,Integer>{

	@Override
	public Integer execute(String parm) {
		return Integer.parseInt(parm);
	}
	
}
//扩展点(将字符串转换为指定类型)
class TypeConvertTask<Result> implements Task<String,Result>{

	@Override
	public Result execute(String parm) {
		//可借助反射技术对参数类型进行转换
		return null;
	}
	
}
public class TestGeneric03 {
	public static void main(String[] args) {
		Converttask c = new Converttask();
		Integer execute = c.execute("100");
		System.out.println(execute);
		
	}
}
