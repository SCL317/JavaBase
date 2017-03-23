package com.scl.Test;

//import java.io.PrintStream;

//控制台打出1~7~13.....100
public class Work2 {

	public static void main(String[] args) {

		
		 for (int i = 1,j = 6 ;i<=100 ;i +=j ){
		  System.out.print(" _ " + i); }
		 
		  
		
		for (int a = 0, c= 0; c<=100; a++) {
			System.out.print(" _ " + a);
			c = 1 + (6 * a);//7=1+6*1 13=1+6*2
			if (c > 100) {
				break;
				//continue;
			}
			System.out.print(" _ " + c+ "\n");
		}
		
	}
}
