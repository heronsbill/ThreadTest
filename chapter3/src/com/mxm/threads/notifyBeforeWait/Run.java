package com.mxm.threads.notifyBeforeWait;

public class Run {
	public static void main(String[] args) {
		Object obj = new Object();
		
		MyWaitThread waitThread = new MyWaitThread(obj);
		MyNotifyThread notifyThread = new MyNotifyThread(obj);
		
		notifyThread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		waitThread.start();
	}
}
