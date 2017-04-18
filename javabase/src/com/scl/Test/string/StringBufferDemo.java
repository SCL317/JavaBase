package com.scl.Test.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("124314");
		sb.append("asdasd").append(123123);
		System.out.println("StringBuffe添加元素后："+sb);
		//这个是删除指定区域的
		sb.delete(1, 5);
		//这个是删除这个数组里的所有元素
		sb.delete(0, sb.length());
		System.out.println("StringBuffe在delete后："+sb);
	}

}
