package com.mxm.synchronize.volatileAutomicity;

public class Run {
	public static void main(String[] args) {
		MyThread[] threadArray = new MyThread[100];
		for (int i = 0; i < 100; i++){
			threadArray[i] = new MyThread();
		}
		
		for (int i = 0; i < 100; i++){
			threadArray[i].start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(MyThread.count);
	}
}
