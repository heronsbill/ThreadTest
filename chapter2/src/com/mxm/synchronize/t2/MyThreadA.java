package com.mxm.synchronize.t2;

public class MyThreadA extends Thread{
	private HasSelfPrivateNumber numRef;

	public void setNumRef(HasSelfPrivateNumber numRef) {
		this.numRef = numRef;
	}

	@Override
	public void run(){
		super.run();
		numRef.addN("A");
//		numRef.addI("A");
	}
}
