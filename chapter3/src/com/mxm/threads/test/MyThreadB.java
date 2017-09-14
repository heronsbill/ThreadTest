package com.mxm.threads.test;

public class MyThreadB extends Thread{
	private Object lockObject;
	
	public MyThreadB(Object obj){
		this.lockObject = obj;
	}
	
	@Override
	public void run(){
		synchronized (lockObject) {
			System.out.println("notify��ʼ time=" + System.currentTimeMillis());
			lockObject.notify();
			System.out.println("notify���� time=" + System.currentTimeMillis());
		}
	}
}
