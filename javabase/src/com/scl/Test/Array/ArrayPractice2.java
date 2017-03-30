package com.scl.Test.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice2 {

	public static void main(String[] args) {
		int[] score = new int[10];
		int sum = 0;
		double avg = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("输入10个数： ");
		for (int i = 0; i < score.length; i++) {
			score[i] = input.nextInt();
			sum = sum + score[i];
		}
		System.out.println("这些数字的和为: " + sum);

		avg = (double) sum / score.length;
		System.out.println("这些数字的平均数为: " + avg);

		// 升序排列
		int i = 0;
		Arrays.sort(score);// 这个是调用系统里的排序方法 //
		System.out.println("这些数字的升序为: ");
		for (i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "]" + score[i]);
		}
		System.out.println("这时候的最大值在第" + i + "位");// 这里通过调用最大数时i的值
		// 降序排列
		for (; i > 0; i--) {
			System.out.println("score[" + (i - 1) + "]" + score[i - 1]);
		} // 因为是i++ 先使用后自增所以真实的能使用应该为i-1

		// 最大值
		int max = 0;
		// 最好应该将这个int m=a[0];随意赋值输入的数据
		for (int b = 0; b < score.length; b++) {
			if (max < score[b]) {
				max = score[b];
			}
		}
		System.out.println("这里面最大值为： " + max);

		// 最小值
		int min = 0;
		// 这边这样定义不好应为如果输入的值为负数比较最小值会出现问题；最好应该将这个int min=a[0];随意赋值输入的数据
		for (int c = 0; c < score.length; c++) {
			if (min > score[c]) {
				max = score[c];
			}
		}
		System.out.println("这里面最小值为： " + min);

	}

}
