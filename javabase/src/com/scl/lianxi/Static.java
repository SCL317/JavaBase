package com.scl.lianxi;

public class Static {
    String name = "xiaoming";//非静态变量name；
    static String hobby = "play"; //静态变量hobby；
	public static void main(String[] args) {
		/* 静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员
		 * Cannot make a static reference to the non-static field name
		 * 不能让一个静态引用非静态字段名
		 */
	/*	System.out.println("欢迎"+name+"!");
		System.out.println("爱好"+hobby+"!");*/
		
		
		Static N = new Static();
		//如果希望在静态方法中调用非静态变量，可以通过创建类的对象，然后通过对象来访问非静态变量
		System.out.println("欢迎"+N.name+"!");
		System.out.println("爱好"+hobby+"!");

	}
	
	}


