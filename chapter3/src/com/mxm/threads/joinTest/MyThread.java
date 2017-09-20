package com.mxm.threads.joinTest;

public class MyThread extends Thread{
	@Override
	public void run(){
		int randomValue = (int) (Math.random() * 10000);
		System.out.println(randomValue);
		try {
			Thread.sleep(randomValue);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
