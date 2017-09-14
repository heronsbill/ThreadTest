package com.mxm.threads.waitOld;

public class AddThread extends Thread{
	private Object lock;
	
	public AddThread(Object obj){
		this.lock = obj;
	}
	
	@Override
	public void run(){
		synchronized (lock) {
			System.out.println("add one");
			MyArrayList.list.add("xxx");
			lock.notifyAll();
		}
	}
}
