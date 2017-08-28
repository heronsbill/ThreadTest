package com.mxm.thread.suspend;

public class MyThread extends Thread{
	private long i;

	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}
	
	@Override
	public void run(){
		while (true){
			i++;
		}
	}
}
