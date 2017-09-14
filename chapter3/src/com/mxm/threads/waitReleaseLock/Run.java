package com.mxm.threads.waitReleaseLock;

public class Run {
	public static void main(String[] args) {
		Object obj = new Object();
		MyThread threadA = new MyThread(obj);
		MyThread threadB = new MyThread(obj);
		
		threadA.start();
		threadB.start();
	}
}
