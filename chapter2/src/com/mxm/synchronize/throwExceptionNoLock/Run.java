package com.mxm.synchronize.throwExceptionNoLock;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		MyThread threadA = new MyThread();
		MyThread threadB = new MyThread();
		threadA.setService(service);
		threadB.setService(service);
		
		threadA.setName("A");
		threadB.setName("B");
		
		threadA.start();
		threadB.start();
	}
}
