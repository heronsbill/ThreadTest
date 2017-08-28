package com.mxm.thread.priority;

import java.util.Random;

public class MyThreadA extends Thread{
	public MyThreadA(String name){
		super(name);
	}
	
	@Override
	public void run(){
		long beginTime = System.currentTimeMillis();
		System.out.println("Thread A - " + this.getName() + " start at time " + beginTime);
		long addResult = 0L;
		for (int i = 0; i < 50000; i++){
			Random random = new Random();
			random.nextInt();
			addResult += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Thread A - " + this.getName() + " end at time " + endTime 
				+ ", cost time " + (endTime - beginTime));
		
	}
}
