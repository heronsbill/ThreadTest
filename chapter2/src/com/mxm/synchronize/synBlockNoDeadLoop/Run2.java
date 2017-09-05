package com.mxm.synchronize.synBlockNoDeadLoop;

public class Run2 {

	public static void main(String[] args) {
		final Service2 service = new Service2();
		
		Thread threadA = new Thread(){
			@Override
			public void run(){
				service.method1();
			}
		};
		Thread threadB = new Thread(){
			@Override
			public void run(){
				service.method2();
			}
		};
		threadA.start();
		threadB.start();
	}
}
