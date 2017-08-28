package com.mxm.thread.daemon;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.setDaemon(true);
		thread.start();
		Thread.sleep(3000);
		System.out.println("ÎÒÒªÍ£Ö¹ÁË");
	}
}
