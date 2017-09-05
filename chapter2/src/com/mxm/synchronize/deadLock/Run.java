package com.mxm.synchronize.deadLock;

public class Run {
	public static void main(String[] args) {
		DeadLockThread t1 = new DeadLockThread();
		
		t1.setFlag("A");
		Thread threadA = new Thread(t1);
		threadA.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.setFlag("B");
		Thread threadB = new Thread(t1);
		threadB.start();
		
	}
}
