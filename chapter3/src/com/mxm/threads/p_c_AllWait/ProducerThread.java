package com.mxm.threads.p_c_AllWait;

public class ProducerThread extends Thread{
	private Producer p;
	
	public ProducerThread(String name, Producer p){
		super(name);
		this.p = p;
	}
	
	@Override
	public void run(){
		while(true){
			p.create();
		}
	}
}
