package com.mxm.threads.test;

public class MyThreadB extends Thread{
	private Object lockObject;
	
	public MyThreadB(Object obj){
		this.lockObject = obj;
	}
	
	@Override
	public void run(){
		synchronized (lockObject) {
			System.out.println("notify¿ªÊ¼ time=" + System.currentTimeMillis());
			lockObject.notify();
			System.out.println("notify½áÊø time=" + System.currentTimeMillis());
		}
	}
}
