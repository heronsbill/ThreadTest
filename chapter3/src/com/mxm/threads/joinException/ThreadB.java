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
			System.out.println("�߳�B��join end����ӡ��");
		} catch (InterruptedException e) {
			System.out.println("�߳�B��catch����ӡ��");
			e.printStackTrace();
		}
	}
}
