package com.mxm.threads.join_sleep_1;

public class ThreadC extends Thread{
	private ThreadA threadA;
	
	public ThreadC(ThreadA A){
		super();
		this.threadA = A;
	}
	
	@Override
	public void run(){
		threadA.testService();
	}
}
