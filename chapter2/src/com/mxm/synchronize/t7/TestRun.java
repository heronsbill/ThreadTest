package com.mxm.synchronize.t7;

public class TestRun {
	public static void main(String[] args) {
		final Test test = new Test();
		
		Thread thread1 = new Thread("A"){
			@Override
			public void run(){
				test.tt();
			}
		};
		
		Thread thread2 = new Thread("B"){
			@Override
			public void run(){
				Test.tts();
			}
		};
		
		thread1.start();
		thread2.start();
	}
}
