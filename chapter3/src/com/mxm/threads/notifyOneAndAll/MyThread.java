package com.mxm.threads.notifyOneAndAll;

public class MyThread  extends Thread{
	private Object lock;
	
	public MyThread(String name, Object obj){
		super(name);
		this.lock = obj;
	}
	
	@Override
	public void run(){
		synchronized (lock) {
			try {
				System.out.println(Thread.currentThread().getName() + " wait begin");
				lock.wait();
				System.out.println(Thread.currentThread().getName() + " wait end");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
