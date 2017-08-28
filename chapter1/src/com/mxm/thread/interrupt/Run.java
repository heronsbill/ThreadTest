package com.mxm.thread.interrupt;

public class Run {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {
			mt.interrupt();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
