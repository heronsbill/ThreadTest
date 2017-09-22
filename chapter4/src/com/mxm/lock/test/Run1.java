package com.mxm.lock.test;

public class Run1 {
	public static void main(String[] args) {
		final MyService1 myService = new MyService1();
		
		Runnable runnableA = new Runnable(){
			@Override
			public void run(){
				myService.methodA();
			}
		};
		
		Runnable runnableB = new Runnable(){
			@Override
			public void run(){
				myService.methodB();
			}
		};
		
		Thread threadA = new Thread(runnableA, "A");
		threadA.start();
		Thread threadAA = new Thread(runnableA, "AA");
		threadAA.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread threadB = new Thread(runnableB, "B");
		threadB.start();
		Thread threadBB = new Thread(runnableB, "BB");
		threadBB.start();
	}
}
