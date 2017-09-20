package com.mxm.threads.p_c_stack;

public class ConsumerThread extends Thread{
	private Consumer consumer;
	
	public ConsumerThread(String name, Consumer consumer){
		super(name);
		this.consumer = consumer;
	}
	
	@Override
	public void run(){
		while(true){
			consumer.consume();
		}
	}
}
