package com.mxm.thread.interrupt.exception;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		try{
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch(InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
