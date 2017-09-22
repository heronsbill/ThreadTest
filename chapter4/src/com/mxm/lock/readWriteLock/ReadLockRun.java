package com.mxm.lock.readWriteLock;

public class ReadLockRun {
	public static void main(String[] args) throws InterruptedException {
		final MyService service = new MyService();
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				service.read();
			}
		};
		
		Thread threadA = new Thread(runnable, "A");
		threadA.start();
		Thread.sleep(1000);
		
		Thread threadB = new Thread(runnable, "B");
		threadB.start();
	}
}
