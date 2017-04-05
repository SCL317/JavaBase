package com.scl.Test.xunhuan;

import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("请输入三角形的高度：");
	
		int l = input.nextInt();
	
		for (int i = 1; i <= l; i++) {
			for (int j = 1; j <= 2 * l - 1; j++) {
				if (i == 5) {
					System.out.print("*");
				} else if (j == l + 1 - i || j == l - 1 + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
	
			}
			System.out.println("");
		}
		int index = 1;
		int R = 0;
	
		while (index == 1) {
			System.out.println("请输入要水平移动的距离(正数代表向左负数代表向右)：");
			R = input.nextInt();
		
		for (int i = 1; i <= l; i++) {
			for (int j = 1; j <= R + 2 * l - 1; j++) {
				if (i == l) {
					if (j <= R) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (j == R + l + 1 - i || j == R + l - 1 + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("退出请按0！继续请按1！");
		index = input.nextInt();
	
	}
	}
	}
	


