package com.scl.lianxi;

public class Chengji {
	/**
	 * 在编辑器中分别定义了两个静态变量 score1 和 score2 ，
	 * 用于保存成绩信息。定义了一个静态方法 sum ，用于计算成绩总分，
	 * 在 main 方法中通过调用静态方法输出成绩总分
	 * score1 = 86    score2 = 92;
	 * */
     static int score1 = 86;
     static int score2 = 92;
	public static int sum(){
		int sum = score1+score2;
		return sum;
	}
	
	public static void main(String[] args) {
		int Sum = Chengji.sum();//类名.方法()   只要这方法是static修饰
		System.out.println("" +Sum);

	}

	
	
}
