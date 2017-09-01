package com.mxm.synchronize.synOutAsyn;

public class Run {
	public static void main(String[] args) {
		MyList list = new MyList();
		MyThreadA threadA = new MyThreadA(list, "A");
		MyThreadB threadB = new MyThreadB(list, "B");
		
		threadA.start();
		threadB.start();
	}
}
