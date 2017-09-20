package com.mxm.threads.joinException;

public class Run {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB(threadA);
//		ThreadC threadC = new ThreadC(threadB);
		
		threadB.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		threadC.start();
	}
}
