package com.mxm.threads.notifyHoldLock;

public class NotifyThread extends Thread{
	private Object obj;
	
	public NotifyThread(String name, Object obj){
		super(name);
		this.obj = obj;
	}
	
	@Override
	public void run(){
		Service service = new Service();
		service.notifyMethod(obj);
	}
}
