package com.mxm.synchronize.synOneThreadIn;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		MyThread thread1 = new MyThread(service, "A");
		MyThread thread2 = new MyThread(service, "B");
		
		thread1.start();
		thread2.start();
	}
}
