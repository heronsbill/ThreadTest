package com.mxm.threads.join_sleep_1;

public class Run {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB(threadA);
		ThreadC threadC = new ThreadC(threadA);
		
		threadB.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadC.start();
	}
}
