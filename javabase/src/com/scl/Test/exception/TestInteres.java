package com.scl.Test.exception;
public class TestInteres {
	public static void main(String[] args) {
		int ret = test();
		System.out.println(ret);
	}

	public static int test() {
		int a = 1;
		try {
			return a;
			//System.out.println(a);
		}
		finally {
			++a;
			System.out.println("a = " +a);
		}
	}
}