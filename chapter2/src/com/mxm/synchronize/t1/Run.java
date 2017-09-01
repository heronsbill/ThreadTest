package com.mxm.synchronize.t1;

public class Run {
	public static void main(String[] args) {
		HasSelfPrivateNumber numRef = new HasSelfPrivateNumber();
		MyThreadA threadA = new MyThreadA();
		MyThreadB threadB = new MyThreadB();
		threadA.setNumRef(numRef);
		threadB.setNumRef(numRef);
		
		threadA.start();
		threadB.start();
	}
}
