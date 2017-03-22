package com.scl.Test;

import java.util.Scanner;

public class LoopDome {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个值");
		int num = input.nextInt();
        //for loop
		for (int i = 0; i <= num; i++){
			System.out.println("厉害了");

		}
		//while loop
		int j = 0;
		while (j < num){
			System.out.println("这个是while " + j);
			j++;
		}
		//do while
		int i = 0;
		do{
			System.out.println("这个是 do while " + i);
			i++;
		}while(i < num);
		
		//foreach loop
		String[] str = {"AA","BB","CC"};
		for (String string : str){
			System.out.println("数组的元素为：" +string);
		}
	}

}
