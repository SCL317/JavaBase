package com.scl.Test;

public class Jia {

	public static void main(String[] args) {
		
		//do while
		int i = 1;//int i=1 和int j=2在使用后不会再调用所以占用内存这个时候就是for语句更好了
		int j = 2;
		do {
			i += j;
			/*System.out.println("叠加的和： " + i);
			一定要明确哪些语句需要循环哪些不需要循环，这个如果执行了他会把每个循环的值都打印出来这个不合适。*/
			j++;
		} while (j <= 100);
		System.out.println("1叠加的和： " + i);
		
		
		//用for来体现
		for (int a=1 ; a<=100 ;a++){
			int sum = 0;
			sum = sum + a;	
		}
		System.out.println("2叠加的和： " + i);
		

	}

}
// 1~100这些数字相加的和