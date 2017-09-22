package com.mxm.lock.lockMethodTest;

public class LockInterruptiblyTestRun {
	public static void main(String[] args) {
		final MyService3 service = new MyService3();
		
		Thread lockInterruptiblyThread = new Thread("InterruptiblyThread"){
			@Override
			public void run(){
				service.lockInterruptiblyMethod();
			}
		};
		lockInterruptiblyThread.start();
		lockInterruptiblyThread.interrupt();
	
		Thread thread = new Thread("NormalThread"){
			@Override
			public void run(){
				service.normalMethod();
			}
		};
		thread.start();
		thread.interrupt();
	}
}
