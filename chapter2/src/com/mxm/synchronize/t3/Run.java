package com.mxm.synchronize.t3;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		final PublicVar object = new PublicVar();
		
		Thread thread = new Thread(){
			@Override
			public void run(){
				object.setValue("AAA", 18);
			}
		};
		
		thread.start();
		Thread.sleep(1000);
		
		System.out.println(object.toString());
		Thread.sleep(2000);
		System.out.println(object.toString());
	}
}
