package com.scl.Test.exception;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		try {int age=-5;
			if (age<0) {
				//System.out.println("这里的age不能小于0");
				throw new ByZeroException("这里的age不能小于0");
			}else{
				System.out.println("这里的age有效");
			}		
		
		} catch (ByZeroException bye) {
			bye.printStackTrace();
		}
		
		
		//System.out.println("这里返回的值为: " + exc());
	}
	
/*	public static int exc() {
		Scanner input = new Scanner(System.in);
		System.out.println("这里输入两个数值：");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			System.out.println("这两个数相出： " + num1 / num2);
			return num2;
	}*/
	

		
		
}
