package com.scl.lianxi;

public class ZhaZhiJi {
	public String zhazhi(String fruit){
		String juice = fruit + "汁";
		return juice;
	}

	public static void main(String[] args) {
		ZhaZhiJi myZhaZhiJi = new ZhaZhiJi();
		String myFruit ="苹果";
		/*String myjuice =myZhaZhiJi.zhazhi(myFruit);
		System.out.println(myjuice);*/
		
		String myjuice = myZhaZhiJi.zhazhi(myFruit);
		System.out.println();
		
	}

}
