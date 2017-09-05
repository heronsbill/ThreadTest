package com.mxm.synchronize.atomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread{
	private AtomicInteger count = new AtomicInteger(0);
	
	@Override
	public void run(){
		for (int i = 0; i < 10000; i++){
			System.out.println(count.incrementAndGet());
		}
	}
}
