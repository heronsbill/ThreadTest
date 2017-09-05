package com.mxm.synchronize.synStaticMethod;

public class Run {
	public static void main(String[] args) {
		final Service service = new Service();
		Thread threadA = new Thread("A"){
			@Override
			public void run(){
				service.methodA();
			}
		};
		Thread threadB = new Thread("B"){
			@Override
			public void run(){
				service.methodB();
			}
		};
		Thread threadC = new Thread("C"){
			@Override
			public void run(){
				service.methodC();
			}
		};
		Thread threadD = new Thread("D"){
			@Override
			public void run(){
				service.methodD();
			}
		};
		
		threadA.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadB.start();
		threadC.start();
		threadD.start();
	}
}
