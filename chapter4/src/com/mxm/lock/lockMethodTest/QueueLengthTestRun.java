package com.mxm.lock.lockMethodTest;

public class QueueLengthTestRun {
	public static void main(String[] args) throws InterruptedException {
		final MyService service = new MyService();
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				service.queueLengthService();
			}
		};
		
		Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++){
			threads[i] = new Thread(runnable);
			threads[i].start();
		}
		
		Thread.sleep(2000);
		
		System.out.println("有线程数：" + service.lock.getQueueLength()
				+ "在等待获得锁！");
		
	}
}
