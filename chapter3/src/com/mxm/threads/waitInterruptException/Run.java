package com.mxm.threads.waitInterruptException;

public class Run {
	public static void main(String[] args) {
		Object object = new Object();
		MyThread thread = new MyThread("A", object);
		
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt();
	}
}
