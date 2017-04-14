package com.scl.Test.Thread;

import java.io.PrintStream;

public class MyRunnable implements Runnable {
	PrintStream out = System.out;

	@Override
	public void run() {
		System.out.println("当前线程输出的是 ：" + Thread.currentThread().getName());
		// currentThread()返回对当前正在执行的线程对象的引用。
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "--" + i+"--"+Thread.currentThread().isDaemon());

		}

	}
}