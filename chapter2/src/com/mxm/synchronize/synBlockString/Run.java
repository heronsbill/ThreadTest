package com.mxm.synchronize.synBlockString;

public class Run {
	public static void main(String[] args) {
		final Service service = new Service();
		
		Thread thread1 = new Thread("A"){
			@Override
			public void run(){
				service.setUser("AA", 12);
			}
		};
		Thread thread2 = new Thread("B"){
			@Override
			public void run(){
				service.setUser("BB", 14);
			}
		};
		
		thread1.start();
		thread2.start();
	}
}
