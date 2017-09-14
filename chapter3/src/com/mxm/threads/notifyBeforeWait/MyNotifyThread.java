package com.mxm.threads.notifyBeforeWait;

public class MyNotifyThread extends Thread{
	private Object lock;
	
	public MyNotifyThread(Object obj){
		this.lock = obj;
	}
	
	@Override
	public void run(){
		synchronized (lock) {
			System.out.println("notify begin");
			lock.notify();
			System.out.println("notify end");
		}
	}
}
