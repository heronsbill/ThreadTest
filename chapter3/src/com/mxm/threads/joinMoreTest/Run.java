package com.mxm.threads.joinMoreTest;

public class Run {
	public static void main(String[] args) {
		try {
			ThreadA threadA = new ThreadA();
			ThreadB threadB = new ThreadB(threadA);
			
			threadA.start();
			threadB.start();
			threadA.join(2100);
			System.out.println("main thread at time= "
					+ System.currentTimeMillis());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
