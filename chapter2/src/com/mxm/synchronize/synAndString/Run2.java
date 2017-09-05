package com.mxm.synchronize.synAndString;

public class Run2 {
	public static void main(String[] args) {
		final Service service = new Service();
		
		Thread threadA = new Thread("A"){
			@Override
			public void run(){
				service.print(new Object());
			}
		};
		Thread threadB = new Thread("B"){
			@Override
			public void run(){
				service.print(new Object());
			}
		};
		
		threadA.start();
		threadB.start();
	}
}
