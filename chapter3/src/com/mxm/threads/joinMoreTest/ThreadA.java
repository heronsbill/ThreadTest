package com.mxm.threads.joinMoreTest;

public class ThreadA extends Thread{
	@Override
	public synchronized void run(){
		try{
			System.out.println("ThreadA begin at time = "
					+ System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println("ThreadA end at time ="
					+ System.currentTimeMillis());
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
