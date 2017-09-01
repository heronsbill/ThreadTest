package com.mxm.synchronize.throwExceptionNoLock;

public class MyThread extends Thread{
	private Service service;
	
	public void setService(Service service){
		this.service = service;
	}
	
	@Override
	public void run(){
		service.testMethod();
	}
}
