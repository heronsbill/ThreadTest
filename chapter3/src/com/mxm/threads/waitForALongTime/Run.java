package com.mxm.threads.waitForALongTime;

public class Run {
	public static void main(String[] args) {
		Object obj = new Object();
		MyThread thread = new MyThread("mxm", obj);
		
		thread.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (obj) {
			obj.notify();
		}
	}
}
