package com.mxm.synchronize.t7;

public class Run {
	public static void main(String[] args) {
		Task task = new Task();
		
		MyThread thread1 = new MyThread(task, "A");
		MyThread thread2 = new MyThread(task, "B");
		
		thread1.start();
		thread2.start();
	}
}
