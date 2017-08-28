package com.mxm.thread.suspend;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		
		Thread.sleep(5000);
		thread.suspend();
		
		System.out.println("A-time = " + System.currentTimeMillis() + "  i =" + thread.getI());
		Thread.sleep(5000);
		System.out.println("A-time = " + System.currentTimeMillis() + "  i =" + thread.getI());
		
		thread.resume();
		Thread.sleep(5000);
		thread.suspend();
		
		System.out.println("B-time = " + System.currentTimeMillis() + "  i =" + thread.getI());
		Thread.sleep(5000);
		System.out.println("B-time = " + System.currentTimeMillis() + "  i =" + thread.getI());
	}
}
