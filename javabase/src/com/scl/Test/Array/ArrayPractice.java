package com.scl.Test.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

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
		Arrays.sort(score);// 这个是调用系统里的排序方法 //
		System.out.println("这些数字的升序为: ");
		for (int i = 0; i < score.length; i++) {
			System.out.println("a[" + i + "]" + score[i]);
		}

		// 降序排列
		System.out.println("这些数字的降序排列序为: ");
		for (int i = (score.length - 1); i > 0; i--) {
			System.out.println("score[" + i + "]" + score[i]);
		} // 这里需要晓得score.length的具体的定义和数值 

		// 最大值
		int max =score[0];
		// 最好应该将这个int m=score[0];随意赋值输入的数据
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		System.out.println("这里面最大值为： " + max);

		// 最小值
		int min =score[0];
		/*这边这样定义不好应为如果输入的值为负数或者小于0的时候会出问题比较最小值会出现问题；
		最好应该将这个int min=score[0];随意赋值输入的数据*/
		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				max = score[i];
			}
		}
		System.out.println("这里面最小值为： " + min);

	}

}
