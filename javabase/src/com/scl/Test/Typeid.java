package com.scl.Test;

public class Typeid {

	public static void main(String[] args) {
		//Java运算判断大小运算
		int a =50;
		int b =60;
		System.out.println("a>b: " +(a>b));
		System.out.println("a>=b: " +(a>=b));
		System.out.println("a==b: " +(a==b));
		System.out.println("a!=b: " +(a!=b));
		System.out.println("a<b: " +(a<b));
		System.out.println("a<=b: " +(a<=b));
		//a>b加上（）是为了优先计算不带入会提示出错或者和+形成其他形式的输出变量
		
		//逻辑运算实例
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1 && bn2 : " +(bn1 && bn2));
		System.out.println("bn1 || bn2 : " +(bn1 || bn2));
		System.out.println("!bn1 : " +(!bn1));
		System.out.println("(1<2) && (3<4) :" +((1<2) && (3<4)));
		System.out.println("(1<2) || (3<4) :" +((1<2) || (3<4)));
		
		//三元/目运算符
		int i=5,j=6;
		String result = i > j ? "i>j" :"i<j";//这是个表达式如果i>j为真则答案取i 如果为假则取j；
		System.out.println(result);
		
		//字符串操作符
		String address1 = "anhui";
		String address2 = "hefei";
		int code = 5;
		String add = address1 + " " + address2 +" "+ code + " " +"号" ;//中间的“”表示空串
		System.out.println("add : " + add);
		
		//类型转换操作符
		int num = 10;
		short shot;
		shot = (short) num;//int形赋值short形需要强制装换；
		System.out.println("shot : " + shot);
				
		//递增递减运算符
		int age = 6;
		System.out.println("age : " + age);
		age++;//先使用再++
		System.out.println("age++ : " + age);
		++age;//先++再使用
		System.out.println("++age : "+ age);
		age--;
		System.out.println("age-- : " + age);
		--age;
		System.out.println("--age : " + age);
		


	}

}
