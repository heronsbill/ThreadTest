package com.mxm.thread.suspend;

public class Run4 {
	public static void main(String[] args) throws InterruptedException {
		final MyObject object = new MyObject();
		Thread thread = new Thread(){
			@Override
			public void run(){
				object.setValue("A", "AAAAA");
			}
		};
		thread.setName("A");
		thread.start();
		
		Thread.sleep(2000);
		object.printObject();
	}
}
