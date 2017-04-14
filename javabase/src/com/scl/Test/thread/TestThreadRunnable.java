package com.scl.Test.thread;

public class TestThreadRunnable {

	public static void main(String[] args) {
		Thread thread = new MyThread();
		thread.setName("MyThread");
		thread.start();

		Thread myRunnable = new Thread(new MyRunnable());
		myRunnable.setName("MyRunnable");
		myRunnable.start();

	}

}
