package com.mxm.threads.join_sleep_1;

public class ThreadA extends Thread{
	@Override
	public void run(){
		try{
			System.out.println("a start at time = " 
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("a end at time = "
					+ System.currentTimeMillis());
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	synchronized public void testService(){
		System.out.println("time now = " + System.currentTimeMillis());
	}
}
