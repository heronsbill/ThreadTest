package com.mxm.threads.join_sleep_1;

public class ThreadB extends Thread{
	private ThreadA threadA;
	
	public ThreadB(ThreadA A){
		super();
		this.threadA = A;
	}
	@Override
	public void run(){
		synchronized (threadA) {
			threadA.start();
			try {
//				Thread.sleep(6000);
				threadA.join(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
