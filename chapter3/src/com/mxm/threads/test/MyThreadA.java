package com.mxm.threads.test;

public class MyThreadA extends Thread{
	private Object lockObject;
	
	public MyThreadA(Object object){
		this.lockObject = object;
	}
	
	@Override
	public void run(){
		try{
			synchronized (lockObject) {
				System.out.println("wait��ʼ time=" + System.currentTimeMillis());
				lockObject.wait();
				System.out.println("wait���� time=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
