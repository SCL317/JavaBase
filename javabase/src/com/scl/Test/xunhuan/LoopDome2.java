package com.scl.Test.xunhuan;

import java.util.Scanner;

public class LoopDome2 {

	public static void forDemo(int num) {
		for (int i = 0; i <= num; i++) {
			if (i == 3){
				//break;//break直接跳出不运行了 
				//continue;//continue跳过当次循环
				//return;//return的直接结束循环连带后来的System.out.println("end结束-----------")都直接不执行了
			}
				System.out.println("厉害了 " + i);
		}
		System.out.println("end结束-----------");
	}

	public static void forDemo2(int num) {
		System.out.println("In forDemo mrethod：  ");
		for (int i = 0; i <= num; i++) {
			System.out.println("嵌套循环的外循环---" + i);
			for (int j=15;j<=num;j--){
            System.out.println("嵌套循环的内循环--- " + j);
			}
		}
		
	}
	public static void whileDemo(int num) {
		int j = 0;
		while (j < num) {
			System.out.println("这个是while " + j);
			j++;
		}
	}

	public static void dowhileDemo(int num) {
		int i = 0;
		do {
			System.out.println("这个是 do while " + i);
			i++;
		} while (i < num);
	}

	public static void foreachDemo(int num) {
		String[] str = { "AA", "BB", "CC" };
		for (String string : str) {
			System.out.println("数组的元素为：" + string);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个值");
		int num = input.nextInt();
		// for loop
		forDemo(num);
		
		// for loop
		forDemo2(num);

		/*// while loop
		whileDemo(num);
		

		// do while
		dowhileDemo(num);

		// foreach loop
		foreachDemo(num);*/
	}

}
