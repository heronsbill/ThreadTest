package com.mxm.thread.sleep;

public class MyThread extends Thread{

	@Override
	public void run(){
		try{
			System.out.println("run threadName = " + Thread.currentThread().getName() + "begin");
			Thread.sleep(2000);
			System.out.println("run threadName = " + Thread.currentThread().getName() + "end");
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
