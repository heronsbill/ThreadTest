package com.mxm.thread.yield;

public class MyThread extends Thread{
	@Override
	public void run(){
		int count = 0;
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++){
//			Thread.yield();
			count = count + (i + 1);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("×Ü¹²ºÄÊ±£º" + (endTime - beginTime) + "ºÁÃë£¡");
	}
	
}
