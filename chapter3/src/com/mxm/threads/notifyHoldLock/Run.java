package com.mxm.threads.notifyHoldLock;

public class Run {
	public static void main(String[] args) {
		Object obj = new Object();
		WaitThread threadA = new WaitThread("A", obj);
		NotifyThread threadB = new NotifyThread("B", obj);
		
		threadA.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadB.start();
	}
}
