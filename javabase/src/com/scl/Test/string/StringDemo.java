package com.scl.Test.string;

public class StringDemo {

	public static void main(String[] args) {
		StringDemo1();
		StringDemo2();
		StringDemo3();
		StringDemo4();
	}

	public static void StringDemo1() {
		char[] c = { 'a', 'e', 'r', 't', 'z' };
		String string = new String(c, 1, 3);
		System.out.println("StringDemo1="+string);
	}
	
	public static void StringDemo2() {
		char[] c = { 'a', 'e', 'r', 't', 'z' };
		String string = new String(c);
		System.out.println("StringDemo2="+string);
	}
	
	public static void StringDemo3() {
		byte[] c = {97,67,43,65,76};
		String string = new String(c);
		System.out.println("StringDemo3="+string);
	}
	
	public static void StringDemo4() {
		byte[] c = {97,67,43,65,76 };
		String string = new String(c);
		System.out.println("StringDemo3="+string);
	}
	
}
