package com.mxm.thread.suspend;

public class Run2 {
	public static void main(String[] args) throws InterruptedException {
		final SynchronizedObject object = new SynchronizedObject();
		
		Thread thread = new Thread(){
			@Override
			public void run(){
				object.printString();
			}
		};
		thread.setName("A");
		thread.start();
		
		Thread thread2 = new Thread(){
			@Override
			public void run(){
				object.printString();
			}
		};
		thread2.start();
		Thread.sleep(2000);
		
		thread.resume();
		
	}
}
