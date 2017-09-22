package com.mxm.lock.lockMethodTest;

public class AwaitUninterruptiblyTestRun {
	public static void main(String[] args) throws InterruptedException {
		final MyService3 service = new MyService3();
		
		Thread threadA = new Thread(){
			@Override
			public void run(){
				service.awaitMethod();
			}
		};
		
		threadA.start();
		Thread.sleep(1000);
		
		System.out.println("main thread " + service.lock.isHeldByCurrentThread());
		
		Thread thread = new Thread(){
			@Override
			public void run(){
				service.normalMethod();
			}
		};
		thread.start();
		Thread.sleep(1000);
		System.out.println("main thread " + service.lock.isHeldByCurrentThread());
		threadA.interrupt();
		
		Thread threadB = new Thread(){
			@Override
			public void run(){
				service.awaitUninterruptiblyMethod();
			}
		};
		
//		threadB.start();
//		threadB.interrupt();
	}
}
