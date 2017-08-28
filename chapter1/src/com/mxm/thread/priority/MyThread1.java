package com.mxm.thread.priority;

public class MyThread1 extends Thread{
	@Override
	public void run(){
		System.out.println("Thread1's priority = " + this.getPriority());
		MyThread2 thread2 = new MyThread2();
		thread2.start();
	}
}
