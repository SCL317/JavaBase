package com.scl.Test.exam;

public class TestRunnable {

	public static void main(String[] args) throws Exception {
		Thread myRunnable = new Thread(new MyRunnable());
		myRunnable.setName("com.scl.Test.exam.MyRunnable");
		myRunnable.start();
	}
}
