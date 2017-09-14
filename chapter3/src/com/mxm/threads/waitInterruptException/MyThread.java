package com.mxm.threads.waitInterruptException;

public class MyThread extends Thread{
	private Object lock;
	
	public MyThread(String name, Object obj){
		super(name);
		this.lock = obj;
	}
	
	@Override
	public void run(){
		synchronized (lock) {
			try {
				System.out.println("wait begin");
				lock.wait();
				System.out.println("wait end");
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("出现异常了，因为呈wait状态的线程被interrupt了！");
			}
		}
	}
}
