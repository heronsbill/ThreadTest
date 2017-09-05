package com.mxm.synchronize.atomicIntegerNoSafe;

public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		MyThread thread3 = new MyThread();
		MyThread thread4 = new MyThread();
		
		thread1.setService(service);
		thread2.setService(service);
		thread3.setService(service);
		thread4.setService(service);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
