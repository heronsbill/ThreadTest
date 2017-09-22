package com.mxm.lock.fairLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock;
	
	public MyService(boolean isFair){
		this.lock = new ReentrantLock(isFair);
	}
	
	public void testMethod(){
		try{
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "ªÒµ√¡ÀÀ¯");
		} finally{
			lock.unlock();
		}
	}
}
