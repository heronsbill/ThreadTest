package com.mxm.threads.notifyOneAndAll;

public class Run1 {
	public static void main(String[] args) {
		Object obj = new Object();
		MyThread threadA = new MyThread("A", obj);
		MyThread threadB = new MyThread("B", obj);
		MyThread threadC = new MyThread("C", obj);
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (obj) {
			obj.notifyAll();
		}
	}
}
