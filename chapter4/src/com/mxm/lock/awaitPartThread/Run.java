package com.mxm.lock.awaitPartThread;

public class Run {
	public static void main(String[] args) {
		final MyService myService = new MyService();
		
		Runnable awaitRunA = new Runnable(){
			@Override
			public void run(){
				myService.awaitMethodA();
			}
		};
		Runnable awaitRunB = new Runnable(){
			@Override
			public void run(){
				myService.awaitMethodB();
			}
		};
		
		Runnable signalRunA = new Runnable(){
			@Override
			public void run(){
				myService.signalMethodA();
			}
		};
		
		Thread threadWaitA1 = new Thread(awaitRunA, "A1");
		Thread threadWaitA2 = new Thread(awaitRunA, "A2");
		Thread threadWaitA3 = new Thread(awaitRunA, "A3");
		Thread threadWaitA4 = new Thread(awaitRunA, "A4");
		Thread threadWaitA5 = new Thread(awaitRunA, "A5");
		Thread threadWaitA6 = new Thread(awaitRunA, "A6");
		
		threadWaitA1.start();
		threadWaitA2.start();
		threadWaitA3.start();
		threadWaitA4.start();
		threadWaitA5.start();
		threadWaitA6.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread threadSignalA = new Thread(signalRunA);
		threadSignalA.start();
	}
}
