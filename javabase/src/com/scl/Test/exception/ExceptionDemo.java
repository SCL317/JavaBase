package com.scl.Test.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("这里返回的值为: " + exc());
	}
	
	public static int exc() {
		Scanner input = new Scanner(System.in);
		System.out.println("这里输入两个数值：");
		
		try {
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			System.out.println("这两个数相出： " + num1 / num2);
			return 0;
		} catch (ArithmeticException ae) {
			System.out.println("这里出现ArithmeticException异常");
			System.out.println(ae.getMessage());
			return 1;
		} catch (InputMismatchException ime) {
			System.out.println("这里出现ArithmeticException异常");
			return 2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("这里出现Exception异常");
			return 3;
		}   finally {
			System.out.println("程序运行到这里结束了");
		}
	}
}
