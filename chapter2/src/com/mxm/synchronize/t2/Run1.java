package com.mxm.synchronize.t2;

public class Run1 {
	public static void main(String[] args) {
		HasSelfPrivateNumber numRefA = new HasSelfPrivateNumber();
		HasSelfPrivateNumber numRefB = new HasSelfPrivateNumber();
		MyThreadA threadA = new MyThreadA();
		MyThreadB threadB = new MyThreadB();
		threadA.setNumRef(numRefA);
		threadB.setNumRef(numRefB);
		
		threadA.start();
		threadB.start();
	}
}
