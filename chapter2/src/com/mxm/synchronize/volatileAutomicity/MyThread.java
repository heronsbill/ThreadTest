package com.mxm.synchronize.volatileAutomicity;

public class MyThread extends Thread{
	volatile public static int count = 0;
	
	private static void addCount(){
		for (int i = 0; i < 100; i++){
			count++;
		}
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ " count=" + count);
	}
	
	@Override
	public void run(){
		addCount();
	}
}
