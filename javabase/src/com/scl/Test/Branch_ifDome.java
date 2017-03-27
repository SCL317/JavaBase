package com.scl.Test;

import java.util.Scanner;

//可以通过Ctrl+shift+o  自动导包形成；

public class Branch_ifDome {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入分数：");
	int score = input.nextInt();
	
	if(score == 100){
		System.out.println("父亲给她买辆车");
	}else if (score >= 90){
		System.out.println("母亲给她买台笔记本电脑");
	}else if (score >= 60){
		System.out.println("母亲给她买部手机");
	}else if (score < 60){
		System.out.println("没有礼物");
	}else if (score < 30){
		System.out.println("赏赐30大板");
	}
	Scanner input1 = new Scanner(System.in);
	System.out.println("输入： " );
	int i = input1.nextInt();
	
	for(int j=1;j<10;j++){
		if((i>=(10^j))&&(i<(10^(j+1)))){
			System.out.println("他是"+j+"位数");
		}
		
	}
	

	}

}
