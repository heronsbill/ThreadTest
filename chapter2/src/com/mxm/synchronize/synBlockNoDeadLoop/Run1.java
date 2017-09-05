package com.mxm.synchronize.synBlockNoDeadLoop;

public class Run1 {
	public static void main(String[] args) {
		final Service1 service = new Service1();
		
		Thread threadA = new Thread(){
			@Override
			public void run(){
				service.methodA();
			}
		};
		Thread threadB = new Thread(){
			@Override
			public void run(){
				service.methodB();
			}
		};
		threadA.start();
		threadB.start();
	}
}
