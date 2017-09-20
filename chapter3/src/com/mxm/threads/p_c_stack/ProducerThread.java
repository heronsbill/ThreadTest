package com.mxm.threads.p_c_stack;

public class ProducerThread extends Thread{
	private Producer producer;
	
	public ProducerThread(String name, Producer producer){
		super(name);
		this.producer = producer;
	}
	
	@Override
	public void run(){
		while(true){
			producer.produce();
		}
	}
}	
