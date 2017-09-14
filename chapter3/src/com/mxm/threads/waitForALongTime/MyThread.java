package com.mxm.threads.waitForALongTime;

public class MyThread extends Thread{
	private Object lock;
	
	public MyThread(String name, Object obj){
		super(name);
		this.lock = obj;
	}
	
	@Override
	public void run(){
		try{
			synchronized (lock) {
				System.out.println("wait begin at time = " + System.currentTimeMillis());
				lock.wait(5000);
				System.out.println("wait end at time = " + System.currentTimeMillis());
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
