package com.mxm.threads.notifyHoldLock;

public class WaitThread extends Thread{
	private Object lock;
	
	public WaitThread(String name, Object obj){
		super(name);
		this.lock = obj;
	}
	
	@Override
	public void run(){
		Service service = new Service();
		service.testMethod(lock);
	}
}
