package com.scl.Test.xunhuan;

/*import java.util.Scanner;*/

public class Ts {

	public static void main(String[] args) {
	
	/*	Scanner input = new Scanner(System.in);		
		int num = input.nextInt();*/
		
		int i = 0;
		int water = 15;
		int j = 5;
		do {
			water += j;
			System.out.println("需要挑几桶水： " + i);
			i++;
			
		} while ( water <= 50);
		

	}

}
/*山上有一口缸可以装50升水，现在有15升水。老和尚叫小和尚下山挑水，每次可以挑5升。
问：小和尚要挑几次水才可以把水缸挑满?通过编程解决这个问题。*/