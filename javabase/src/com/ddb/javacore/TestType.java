package com.ddb.javacore;

public class TestType {

	public static void main(String[] args) {
	double score = 98.55;
	String name = "三胖";
    char sex = '男';
	
	System.out.println("本次考试成绩最高的分数：" + score);
	System.out.println("最高成绩的得主：" + name);
	System.out.println("性别：" + sex);
	
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

    short price;
    price = (short) money;
    //强制类型转换语法格式： (目标数据类型)<表达式>
    System.out.println("price is :" + price);
    
    short price2 = 236;
    long testlong;
    testlong = price2;
    //相同的数值类型转换会在表达式中自动完成
    System.out.println("testlong is :" + testlong);
    
	}

}
