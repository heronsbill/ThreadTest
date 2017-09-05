package com.mxm.synchronize.synLockChange;

public class Run1 {
	public static void main(String[] args) throws InterruptedException {
		final ObjectLockService service = new ObjectLockService();
		
		Thread thread1 = new Thread("A"){
			@Override
			public void run(){
				service.testMethod();
			}
		};
		Thread thread2= new Thread("B"){
			@Override
			public void run(){
				service.testMethod();
			}
		};
		
		thread1.start();
		Thread.sleep(100);
		
		thread2.start();
	}
}
