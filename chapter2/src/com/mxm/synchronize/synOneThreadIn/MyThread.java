package com.mxm.synchronize.synOneThreadIn;

public class MyThread extends Thread{
	private Service service;
	public MyThread(Service service, String name){
		super(name);
		this.service = service;
	}
	
	@Override
	public void run(){
		service.testMethod();
	}
}
