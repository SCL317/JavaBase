package com.scl.Test.xunhuan;

import java.util.InputMismatchException;
import java.util.Scanner;

//空心等腰三角
public class Dbsan4 {
	public static void main(String[] args) {
		System.out.println("这里返回結果为: " + exc());
	}
	public static String exc() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("请输入等腰三角形的高： ");
			int h = input.nextInt(); // 确定等腰三角形的高同时这个高充当这个等腰三角形中间的数；
			// 这里是确定这个高不能小于0；
			for(;h <0;) {
				System.out.println("请输入等腰三角形的高不能为负数请重新输入。");
				h = input.nextInt();
			}
			System.out.println("请输入等边三角形的水平位移数： ");
			int r = input.nextInt();
			// 这边是确定位移的数不能为负数；
			for (;r <0;) {
				System.out.println("请输入水平位移数不能为负数请重新输入。");
				r = input.nextInt();
			}
			for (int i = 1; i <= h; i++) {
				// 这是控制行第几行第几行；
				for (int j = 1; j <= h * 2 - 1 + r; j++) {
					// 这个是控制单行里的位数；
					if (i == h) {
						// 这是判定空心的等腰三角形最后一行全是实线；
						if (j >= 1 + r && j <= 2 * h - 1 + r) {
							// 这里是判定最后一行那个范围打出
							System.out.print("*");
						} else {
							System.out.print(" ");
							//这里是输出最后一行的偏移；
						}
					} else if ((j == h - (i - 1) + r) || (j == h + (i - 1) + r)) {// 这个是确定打出等腰三角形的边；
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} catch (InputMismatchException ime) {
			System.out.println("这里出现InputMismatchException异常");
			System.out.println("请输入正常的数值");
			exc();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("这里出现Exception异常");
			System.out.println("请输入正常的数值");
			exc();
		}
		return "正确";
		
	}
}
