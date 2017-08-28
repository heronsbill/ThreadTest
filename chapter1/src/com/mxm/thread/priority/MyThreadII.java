package com.mxm.thread.priority;

public class MyThreadII  extends Thread{
	private long l = 0L;
	
	public long getCount(){
		return l;
	}
	@Override
	public void run(){
		while(true){
			l++;
		}
	}
	
}
