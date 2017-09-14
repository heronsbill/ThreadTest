package com.mxm.threads.waitReleaseLock;

public class MyThread extends Thread{
	private Object lock;
	
	public MyThread(Object obj){
		this.lock = obj;
	}
	
	@Override
	public void run(){
		Service service = new Service();
		service.testMethod(lock);
	}
}
