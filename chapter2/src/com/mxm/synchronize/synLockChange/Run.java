package com.mxm.synchronize.synLockChange;

public class Run {
	public static void main(String[] args) {
		final StringLockService service = new StringLockService();
		
		Thread thread1 = new Thread("A"){
			@Override
			public void run(){
				service.testMethod();
			}
		};
		Thread thread2 = new Thread("B"){
			@Override
			public void run(){
				service.testMethod();
			}
		};
		
		thread1.start();
//		try {
//			Thread.sleep(50);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		thread2.start();
	}
}
