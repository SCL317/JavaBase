package com.scl.Test.xunhuan;

public class Dbsan {

	public static void main(String[] args) {
		//等边三角
		int h=9;
		for(int i=1;i<=h;i++){
			for(int j=1;j<=h*2-1;j++){
			if((j>=h-(i-1))&&(j<=h+(i-1))){
				System.out.print("*");}		
			else {
				System.out.print(" ");}
			}
			System.out.println();	
			
			}
			
		}

	}


