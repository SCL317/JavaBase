package com.scl.Test.Thread;

import javax.xml.crypto.Data;

public class MainThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = Thread.currentThread();
		/*System.out.println("Thread.MAX_PRIORITY: " + Thread.MAX_PRIORITY);
		System.out.println("Thread.MIN_PRIORITY: " + Thread.MIN_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY: " + Thread.NORM_PRIORITY);
		System.out.println("thread.getName(): " + thread.getName());
		System.out.println("thread.getId(): " + thread.getId());
		System.out.println("thread.getPriority(): " + thread.getPriority());
		System.out.println("thread.isAlive(): " + thread.isAlive());
		System.out.println("thread.isDaemon(): " + thread.isDaemon());
		System.out.println("thread.isInterrupted()" + thread.isInterrupted());
		System.out.println("thread.getThreadGroup()" + thread.getThreadGroup());
        

		long start = System.currentTimeMillis();
		System.out.println("开始的时间" + start);
		Thread.sleep(5000); //
		long end = System.currentTimeMillis();
		System.out.println("开始的时间" + end);
		System.out.println("运行的时间差" + (end - start));
		
		thread.yield();
		System.out.println("结束");*/
		
		Thread myRunnable = new Thread(new MyRunnable());
		myRunnable.setName("MyRunnable");
		myRunnable.setDaemon(true);
		myRunnable.start();
		myRunnable.join();  //等待该线程结束
		/*System.out.println("myRunnable.isAlive(): "+myRunnable.isAlive());
		System.out.println("thread.isAlive(): "+thread.isAlive());*/
		//Thread.sleep(1000); 
		
		System.out.println("myRunnable.isDaemon(): "+myRunnable.isDaemon());

	}

}
