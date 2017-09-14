package com.mxm.threads.notifyHoldLock;

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
	
	public void notifyMethod(Object obj){
		try{
			synchronized (obj) {
				System.out.println(Thread.currentThread().getName() + "notify begin time=" + System.currentTimeMillis());
				obj.notify();
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName() + "notify end time=" + System.currentTimeMillis());
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
