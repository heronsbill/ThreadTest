package com.mxm.threads.joinException;

public class ThreadB extends Thread{
	private ThreadA threadA;
	
	public ThreadB(ThreadA threadA){
		super();
		this.threadA = threadA;
	}
	
	@Override
	public void run(){
		try {
//			ThreadA threadA = new ThreadA();
			threadA.start();
			threadA.join();
			System.out.println("线程B在join end处打印了");
		} catch (InterruptedException e) {
			System.out.println("线程B在catch处打印了");
			e.printStackTrace();
		}
	}
}
