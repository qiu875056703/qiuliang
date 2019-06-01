package com.java.jvm;

import java.util.ArrayList;
import java.util.List;

public class TestMemory01 {
	/**JVM内存大小配置:
	 * 最大堆内存:-Xmx20m 最小堆内存:-Xms20
	 * java.lang.OutOfMemoryError: Java heap space 堆内存溢出
	 * */
	public static void main(String[] args) {
		List<byte[]> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new byte[1024*1024*1024]);
		
		}
	}
}
