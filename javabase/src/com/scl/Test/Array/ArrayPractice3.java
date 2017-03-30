package com.scl.Test.Array;

public class ArrayPractice3 {

	public static void main(String[] args) {
		int[] score = { 34,19,11,109,3,56};
		// 不用Arrays.sort的方式排序
		// 降序排列
		/*System.out.println("这里输出的降序排列： ");
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length ; j++) {
				if (score[i] > score[j]) {
					int num = score[j];
					score[j] = score[i];
					score[i] = num;
					//这里不能直接用score[i]=score[j]这种形式因为这是对比大小后的互换
					 //如果这样直接赋值会出现问题这个时候我们需要的是定义第三个变量进行交换
				} else {
					continue;
				}

			}
			System.out.println("score[" + i + "]" + score[i]);
		}*/

		// 冒泡排序
	System.out.println("这里输出的冒泡排列： ");
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length ; j++) {
				if (score[j - 1] > score[j]) {
					int num = score[j];
					score[j] = score[j - 1];
					score[j - 1] = num;
			
				} else {
					continue;
				}
			}
			System.out.println("score[" + i + "]" + score[i]);

		}

	}

}
