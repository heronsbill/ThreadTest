package com.mxm.threads.waitOld;

public class Run {
	public static void main(String[] args) {
		Object obj = new Object();
		AddThread addThread = new AddThread(obj);
		RemoveThread removeThread1 = new RemoveThread("A", obj);
		RemoveThread removeThread2 = new RemoveThread("B", obj);
		
		removeThread1.start();
		removeThread2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		addThread.start();
	}
}
