package com.scl.Test.xunhuan;

public class Dbsan {

	public static void main(String[] args) {
		//等边三角
		int C=9;
		for(int A=1;A<C;A++){
			for(int B=1;B<C*2-1;B++){
				System.out.print(" ");	
			if((B>=C-(A-1))&&(B<=C+(A-1))){
				System.out.print("*");}	
			}
			System.out.println();	
			
			}
			
		}

	}

