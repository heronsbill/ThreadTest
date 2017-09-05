package com.mxm.synchronize.synAndString;

public class Run {
	public static void main(String[] args) {
		final Service service = new Service();
		
		Thread threadA = new Thread("A"){
			@Override
			public void run(){
				service.print("AA");
			}
		};
		Thread threadB = new Thread("B"){
			@Override
			public void run(){
				service.print("AA");
			}
		};
		
		threadA.start();
		threadB.start();
	}
}
