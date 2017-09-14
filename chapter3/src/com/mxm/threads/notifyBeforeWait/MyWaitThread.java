package com.mxm.threads.notifyBeforeWait;

public class MyWaitThread extends Thread{
	private Object lock;
	
	public MyWaitThread(Object obj){
		this.lock = obj;
	}
	
	@Override
	public void run(){
		try{
			synchronized (lock) {
				System.out.println("wait begin");
				lock.wait();
				System.out.println("wait end");
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
