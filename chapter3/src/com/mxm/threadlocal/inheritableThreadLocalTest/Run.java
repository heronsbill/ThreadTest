package com.mxm.threadlocal.inheritableThreadLocalTest;

public class Run {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			System.out.println("mainµÄÖµ£º" + Tools.tle.get());
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ThreadA threadA = new ThreadA();
		threadA.start();
	}
}
