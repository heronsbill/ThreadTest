package com.mxm.lock.test;

public class Run {
	public static void main(String[] args) {
		final MyService myService = new MyService();
		
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				myService.testMethod();
			}
		};
		
		Thread thread = new Thread(runnable);
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		Thread thread4 = new Thread(runnable);
		Thread thread5 = new Thread(runnable);
		
		thread.start();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
