package com.ddb.javacore;
/**
 * Java第四期
 * SCL的日常JAVA练习
 * 时间2017.03.17
 * 这是个文档注释
 */
public class Halloword {
/*这是个多行注释
 * 这是程序的开始
 */
	public static void main(String[] args) {
		// 这是一个单行注释
        // 这里输出消息到控制台
		System.out.println("Hello world!!!");

		/*int money;
		money = 1000;*/
		int money = 1000;
		System.out.println("你的money值为" + money);
		
		final double PI = 3.1415926;//声明一个double型的常量
		System.out.println("输出的PI的值为:" + PI);
		final String NAME = "JACK";//声明一个String型的常量
		System.out.println("输出的NAME的值为:" + NAME);
		
		final char MALE = 'M',FMALE = 'F';
		//同时声明多个变量的时候，用逗号分隔
		System.out.println("输出的MALE的值为:" + MALE);
		System.out.println("输出的FMALE的值为:" + FMALE);
		final int LEFT;//声明一个int常量
		LEFT = 1;//首次赋值
	    //LEFT = 2;二次赋值会出现，常量只能赋值一次
		System.out.println("输出的LEFT的值为:" + LEFT);
	}

}