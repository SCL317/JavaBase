package com.scl.Test.xunhuan;

import java.util.InputMismatchException;
import java.util.Scanner;

//空心等腰三角
public class Dbsan2 {

	public static void main(String[] args) {
		
		System.out.println("这里返回結果为: " + exc());
	}

	public static int exc() {
		try {
			/*Scanner input = new Scanner(System.in);
			System.out.println("请输入等腰三角形的高： ");
			int h = input.nextInt(); // 确定等腰三角形的高同时这个高充当这个等腰三角形中间的数；
			//这里是确定这个高不能小于0；
			if (h<0) {
				System.out.println("请输入h不能为负数请重新输入。");
				return 0;
			}
			System.out.println("请输入等边三角形的水平位移数： ");
			int r = input.nextInt();
			//这边是确定位移的数不能为负数；
			if (r<0) {
				System.out.println("请输入r不能为负数请重新输入。");
				return 1;
			}*/
			
			int h=-1;
			int r =-1;
			boolean isEx = false;

			do {
				Scanner input = new Scanner(System.in);
				System.out.println("请输入2個正确的数值：");
				try {
					h = input.nextInt();
					if (h < 0) {
						System.out.println("请输入h不能为负数请重新输入。");
						h = input.nextInt();
					}
					r = input.nextInt();
					if (r < 0) {
						System.out.println("请输入r不能为负数请重新输入。");
						r = input.nextInt();
					}
					isEx =false;
				} catch (Exception e) {
					System.out.println("请重新输入2個正确的数值：");
					isEx = true;
				}
			} while (isEx);


			for (int i = 1; i <= h; i++) {
				// 这是控制行第几行第几行；
				for (int j = 1; j <= h * 2 - 1 + r; j++) {
					// 这个是控制单行里的位数；
					if (i == h) { // 这是判定空心的等腰三角形最后一行全是实线；
						if (j >= 1 + r && j <= 2 * h - 1 + r) {// 这里是判定最后一行那个范围打出
							System.out.print("*");
						} else {
							System.out.print(" ");
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
			return 2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("这里出现Exception异常");
			return 3;
		} finally {
			System.out.println("程序运行到这里结束了");
		}
		return 0;

	}
}
