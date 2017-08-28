package com.mxm.thread.interrupt.sleep;

public class Run1 {
	public static void main(String[] args) {
		MyThread1 thread = new MyThread1();
		try{
			thread.start();
			thread.interrupt();
			Thread.sleep(100);
		} catch(InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
