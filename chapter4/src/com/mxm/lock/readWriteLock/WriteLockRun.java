package com.mxm.lock.readWriteLock;

public class WriteLockRun {
	public static void main(String[] args) throws InterruptedException {
		final MyService service = new MyService();
		
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				service.write();
			}
		};
		
		Thread threadA = new Thread(runnable ,"A");
		threadA.start();
		Thread.sleep(100);
		
		Thread threadB = new Thread(runnable, "B");
		threadB.start();
	}
}
