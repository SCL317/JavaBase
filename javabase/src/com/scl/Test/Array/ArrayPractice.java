package com.scl.Test.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] a = new int[10];
		int sum = 0;
		double avg = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("输入10个数： ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
			sum = sum + a[i];
		}
		System.out.println("这些数字的和为: " + sum);

		avg = (double) sum / a.length;
		System.out.println("这些数字的平均数为: " + avg);
        
		//排序
		Arrays.sort(a);// 这个是调用系统里的排序方法
		System.out.println("这些数字的排序为: " );
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"]"+a[i]);
		}
		
		//最大值
		int max=0;
		//最好应该将这个int m=a[0];随意赋值输入的数据
		for (int i = 0; i < a.length; i++) {
		if(max < a[i]){
			max = a[i];
			}
		}System.out.println("这里面最大值为： " +max);
		
		//最小值
		int min=0;
		//这边这样定义不好应为如果输入的值为负数比较最小值会出现问题；最好应该将这个int min=a[0];随意赋值输入的数据
		for (int i = 0; i < a.length; i++) {
		if(min > a[i]){
			max = a[i];
			}
		}System.out.println("这里面最小值为： " +min);

	}

}
