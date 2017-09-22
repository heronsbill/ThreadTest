package com.mxm.lock.await;

public class Run {
	public static void main(String[] args) {
		final MyService myService = new MyService();
		
		Thread threadA = new Thread(){
			@Override
			public void run(){
				myService.awaitMethod();
			}
		};
		
		Thread threadB = new Thread(){
			@Override
			public void run(){
				myService.notifyMethod();
			}
		};
		
		threadA.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		threadB.start();
	}
}
