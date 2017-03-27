package com.scl.lianxi;

import java.util.Scanner;

public class SanZhengChu {

	public static void main(String[] args) {
    int sum = 0;
	for(int i = 1;i<=100;i++){
		if(i%3 != 0){
			sum += i;
			}
		}
	System.out.println("sum= " +sum);
	
	//循环将 1 到 10 之间的整数相加，如果累加值大于 20，则跳出循环，并输出当前的累加值。
		int sum1 = 0 ;
		for(int j =1;j<=10;j++){
			if(sum1<=20){
				sum1 += j;
			}else{
				break;
			}
		}System.out.println("sum1= " +sum1);
	
	//求 1 到 10 之间的所有偶数的和。
		int sum2 = 0 ;
		for(int z=1;z<=10;z++){
			if(z%2==0){
				sum2 += z;
                continue;
			}
		}System.out.println("sum2= " +sum2);
		
		
		//判断一个数（小于10位）的位数。输入999，则输出 “它是个3位的数！”
		Scanner input = new Scanner(System.in);
		int q = input.nextInt();
		System.out.println("输入： " );
		
		for(int w=1;w<10;w++){
			if((q>=(10^w))&&(q<(10^(w+2)))){
				System.out.println("他是"+w+"位数");
			}
		}
		}
				
	}



