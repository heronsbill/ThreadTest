package com.mxm.synchronize.t1;

public class MyThreadA extends Thread{
	private HasSelfPrivateNumber numRef;

	public void setNumRef(HasSelfPrivateNumber numRef) {
		this.numRef = numRef;
	}

	@Override
	public void run(){
		super.run();
		numRef.addI("A");
	}
}
