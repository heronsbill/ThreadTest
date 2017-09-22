package com.mxm.lock.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	public Lock lock = new ReentrantLock();
	
	public void testMethod(){
		lock.lock();
		for (int i = 0; i < 5; i++){
			System.out.println(Thread.currentThread().getName() + (i+1));
		}
		lock.unlock();
	}
}
