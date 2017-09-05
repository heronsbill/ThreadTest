package com.mxm.synchronize.atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
	private AtomicLong count = new AtomicLong();
	
	synchronized public void addNum(){
		System.out.println(Thread.currentThread().getName() + " "
				+ count.addAndGet(100));
		count.addAndGet(1);
	}
}
