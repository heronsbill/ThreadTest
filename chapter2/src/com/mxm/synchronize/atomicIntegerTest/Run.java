package com.mxm.synchronize.atomicIntegerTest;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		
		Thread thread1 = new Thread(thread);
		Thread thread2 = new Thread(thread);
		Thread thread3 = new Thread(thread);
		Thread thread4 = new Thread(thread);
		Thread thread5 = new Thread(thread);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
