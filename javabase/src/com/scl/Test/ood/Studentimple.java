package com.scl.Test.ood;

public class Studentimple implements IsStudent {

	@Override
	public void study() {
		System.out.println("study-----");
	}

	@Override   //检查方法的正确性
	public void study(String java) {
		System.out.println("study------" +java);

	}

}
