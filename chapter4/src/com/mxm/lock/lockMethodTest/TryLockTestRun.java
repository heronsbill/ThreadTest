package com.mxm.lock.lockMethodTest;

public class TryLockTestRun {
	public static void main(String[] args) throws InterruptedException {
		final MyService3 service = new MyService3();
		
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				service.tryLockMethod();
			}
		};
		
		Thread threadA = new Thread(runnable);
		Thread threadB = new Thread(runnable);
		threadA.start();
		Thread.sleep(500);
		threadB.start();
		
	}
}
