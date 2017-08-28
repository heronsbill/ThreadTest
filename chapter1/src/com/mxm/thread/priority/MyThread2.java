package com.mxm.thread.priority;

public class MyThread2 extends Thread{
	@Override
	public void run(){
		System.out.println("Thread2's priority = " + this.getPriority());
	}
}
