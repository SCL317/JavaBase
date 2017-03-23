package com.scl.Test;

public class JiuJiu {

	public static void main(String[] args) {
		/*
		 * for (int i=1, j=1 ; i<=9 ; j++,i++){ if( i>j ){ System.out.print("\n"
		 * ); } System.out.print(i+ "*" +j+ "=" + "\t");
		 */
		for (int i=1; i <= 9; i++) 
		{
			for (int j=1; j <=i ; j++)
			{
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}	
	}

}
