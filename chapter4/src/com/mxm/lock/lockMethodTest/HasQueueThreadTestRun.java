package com.mxm.lock.lockMethodTest;

public class HasQueueThreadTestRun {
	public static void main(String[] args) throws InterruptedException {
		final MyService service = new MyService();
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				service.queueThreadService();
			}
		};
		
		Thread threadA = new Thread(runnable);
		Thread threadB = new Thread(runnable);
		
		threadA.start();
		Thread.sleep(500);
		
		threadB.start();
		Thread.sleep(500);
		System.out.println(service.lock.hasQueuedThread(threadA));
		System.out.println(service.lock.hasQueuedThread(threadB));
		System.out.println(service.lock.hasQueuedThreads());
	}
}
