package com.scl.Test.Array;

import java.util.Arrays;
import java.util.Scanner;

import com.scl.Test.A;

/**
 * 有一个数列：8，4，2，1，23，344，12，255 循环输出数列的值 求数列中所有数值的和 猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
 **/
public class Array {

	public static void main(String[] args) {
		int[] a = new int[8]; // 这里是申明变量并分配空间
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("输入数值： ");

		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
			sum = sum + a[i];
		}
		System.out.println("这个数字的和 ： " + sum);

		// 求平均数
		double avg = (double) sum / a.length;// 这里应为定义的sum和a均为int型所以这里需要转成double型
		System.out.println("平均数 ： " + avg);

	}

}
