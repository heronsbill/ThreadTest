package com.mxm.thread.priority;

public class Run1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++){
			MyThreadA threadA = new MyThreadA(i + "");
			MyThreadB threadB = new MyThreadB(i + "");
			threadA.setPriority(10);
			threadB.setPriority(1);
			threadA.start();
			threadB.start();
		}
	}
}
