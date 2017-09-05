package com.mxm.synchronize.atomicIntegerNoSafe;

public class MyThread extends Thread{
	private MyService service;
	
	public void setService(MyService service){
		this.service = service;
	}
	@Override
	public void run(){
		service.addNum();
	}
}
