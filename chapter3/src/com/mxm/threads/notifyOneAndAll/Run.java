package com.mxm.threads.notifyOneAndAll;

public class Run {
	public static void main(String[] args) {
		Object object = new Object();
		MyThread threadA = new MyThread("A", object);
		MyThread threadB = new MyThread("B", object);
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//first notify
		synchronized (object) {
			System.out.println("first notify begin");
			object.notify();
			System.out.println("first notify end");
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//second notify
		synchronized (object) {
			System.out.println("second notify begin");
			object.notify();
			System.out.println("second notify end");
		}
	}
}
