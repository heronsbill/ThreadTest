package com.mxm.lock.await;

public class WrongRun {
	public static void main(String[] args) {
		final MyService myService = new MyService();
		Thread thread = new Thread(){
			@Override
			public void run(){
				myService.wrongMethod();
			}
		};
		thread.start();
	}
}
