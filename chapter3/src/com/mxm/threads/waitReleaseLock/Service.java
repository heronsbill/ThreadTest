package com.mxm.threads.waitReleaseLock;

public class Service {
	public void testMethod(Object obj){
		try{
			synchronized (obj) {
				System.out.println(Thread.currentThread().getName() + " wait begin");
				obj.wait();
				System.out.println(Thread.currentThread().getName() + " wait end");
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
