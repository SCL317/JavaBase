package com.scl.Test;
//输出一个实心的等腰三角形

public class Sanjiaoxin {

	public static void main(String[] args) {
		//矩形
		for(int y=0;y<5;y++){
			for(int x=0;x<5;x++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		//倒三角形
		int z=5;
		for(int i=0;i<5;i++){
			for(int j=0;j<z;j++){
				System.out.print("*");	
			}
			System.out.println();	
			z--;
		}
		
		//正三角
		int c=1;
		for(int a=0;a<5;a++){
			for(int b=0;b<c;b++){
				System.out.print("*");		
			}
			System.out.println();	
			c++;
		}
	}

}
