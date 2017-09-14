package com.mxm.threads.p_c_AllWait;

public class ConsumerThread extends Thread{
	private Consumer c;
	
	public ConsumerThread(String name, Consumer c){
		super(name);
		this.c = c;
	}
	
	@Override
	public void run(){
		while (true){
			c.consume();
		}
	}
}
