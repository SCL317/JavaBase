package com.scl.Test;

public class JiuJiu {

	public static void main(String[] args) {
	
		for (int i=1; i <= 9; i++) //控制行
		{
			for (int j=1; j <=i ; j++)//控制单行的列数也就是单行的有多少个。
			{
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}	
	}

}
