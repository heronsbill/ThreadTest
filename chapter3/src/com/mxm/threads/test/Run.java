package com.mxm.threads.test;

public class Run {
	public static void main(String[] args) {
		Object object = new Object();
		MyThreadA threadA = new MyThreadA(object);
		MyThreadB threadB = new MyThreadB(object);
		
		threadA.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadB.start();
	
	}
}
