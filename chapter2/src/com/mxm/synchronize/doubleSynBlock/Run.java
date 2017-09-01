package com.mxm.synchronize.doubleSynBlock;

public class Run {
	public static void main(String[] args) {
		final Service service = new Service();
		
		Thread thread1 = new Thread("A"){
			@Override
			public void run(){
				service.serviceMethodA();
			}
		};
		
		Thread thread2 = new Thread("B"){
			@Override
			public void run(){
				service.serviceMethodB();
			}
		};
		
		thread1.start();
		thread2.start();
	}
}
