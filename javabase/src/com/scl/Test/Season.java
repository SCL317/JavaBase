package com.scl.Test;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入季节： " );
		int sea = input.nextInt();
		
		if (sea==3 || sea==4 || sea==5){
			System.out.println("春季");
			}else if (sea==6 || sea==7 || sea==8){
				System.out.println("夏季");
			}else if (sea==9 || sea==10 || sea==11){
				System.out.println("秋季");
			}else if (sea==12 || sea==1 || sea==2){
				System.out.println("冬季");
			}
	}

}
