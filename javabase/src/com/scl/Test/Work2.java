package com.scl.Test;

//import java.io.PrintStream;

//控制台打出1~7~13.....100
public class Work2 {

	public static void main(String[] args) {
		/*PrintStream out = System.out;
		out.println("For muti-v demo: " );*/
		for (int i = 1,j = 6 ;i<=100 ;i +=j ){
			
			System.out.print(" _ " + i);
		}
	/*	out.println();
		System.out.println();*/
	}
	/*int i = 1;
	int j = 6;
	do {
	i += j;
	System.out.print(" - " + i);
	i++;
	
	}while (i < 100);
	}*/
}
