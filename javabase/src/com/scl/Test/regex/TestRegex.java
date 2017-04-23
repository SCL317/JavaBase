package com.scl.Test.regex;

import java.util.TreeSet;

public class TestRegex {

	public static void main(String[] args) {

		Test1(); // 治疗口吃
		System.out.println("-------------------------------------------");
		Test2(); // 排序ip地址
		System.out.println("-------------------------------------------");
		Test3(); //验证邮箱地址

	}

	private static void Test3() {
		//验证邮箱地址的正确性
		String s ="asd1@sina.com";
		String regex ="[0-1a-zA-Z_]+@[0-1a-zA-Z]\\.[a-z]{2,3}";
		boolean b = s.matches(regex);
		System.out.println(s+"为邮箱："+b);
	}

	private static void Test2() {
		// 对ip地址进行排序 192.168.1.116 127.0.0.1 3.3.3.3 105.70.11.55
		String s = "192.168.1.116 127.0.0.1 3.3.3.3 105.70.11.55";

		// 因为有些ip是不满3位数的只有以两位所以我们通过这个进行补位
		s = s.replaceAll("(\\d+)", "00$1");
		System.out.println("每个数字前加两个00后：" + s);
		// 这里我们将有些多出来的给去掉保证都是3位数
		s = s.replaceAll("0*(\\d{3})", "$1");
		System.out.println("将多余的0去除后：" + s);

		// 切割掉空格
		String[] str = s.split(" +");

		// 通过Treeset提供的集合中的自然排序排序
		TreeSet<String> ts = new TreeSet<String>();
		for (String string : str) {
			// 通过遍历输出string 不然输出的str:[Ljava.lang.String;@26f0a63f
			ts.add(string); // add()将指定的元素添加到此 set（如果该元素尚未存在于 set 中）。
		}
		System.out.println("排序后为：");
		for (String string : ts) {// 遍历set集合输出
			/*
			 * string =string.replaceAll("0+(\\d+)", "$1");
			 * //这样写会出现这样的问题105.070.011.055---15.70.11.55
			 */
			string = string.replaceAll("0*(\\d+)", "$1");
			System.out.println(string);
		}

	}

	private static void Test1() {
		// 治疗口吃
		String s1 = "我口....口口.....口口...口口口吃吃...吃吃吃.吃吃.吃特特..特特特.别别别..别别别别严严..严严.严严重重重...重";
		// 先是将.点给替换成空的了
		s1 = s1.replaceAll("\\.+", "");
		System.out.println(s1);
		// 再将相同的字给替换成一个
		s1 = s1.replaceAll("(.)\\1+", "$1");
		System.out.println(s1);

	}

}
