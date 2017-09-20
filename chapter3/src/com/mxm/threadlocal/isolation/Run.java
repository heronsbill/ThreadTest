package com.mxm.threadlocal.isolation;

public class Run {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++){
			System.out.println("main µÄÖµ£º" + Tools.tle.get());
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ThreadA threadA = new ThreadA();
		threadA.start();
	}
}
