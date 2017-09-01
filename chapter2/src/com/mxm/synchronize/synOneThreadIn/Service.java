package com.mxm.synchronize.synOneThreadIn;

public class Service {
	public void testMethod(){
		try{
			synchronized(this){
				System.out.println("thread " + Thread.currentThread().getName()
						+ " begin time=" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("thread " + Thread.currentThread().getName()
						+ " end time=" + System.currentTimeMillis());
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
