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
				System.out.println("wait¿ªÊ¼ time=" + System.currentTimeMillis());
				lockObject.wait();
				System.out.println("wait½áÊø time=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
