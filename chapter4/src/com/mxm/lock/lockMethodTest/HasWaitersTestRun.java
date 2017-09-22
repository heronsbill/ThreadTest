package com.mxm.lock.lockMethodTest;

public class HasWaitersTestRun {
	public static void main(String[] args) {
		final MyService service = new MyService();
		
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				service.waitQueueLengthService();
			}
		};
		
		Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++){
			threads[i] = new Thread(runnable);
			threads[i].start();
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		service.signalAllService2();
	}
}
