package com.mxm.lock.await;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	public Lock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();
	
	public void wrongMethod(){
		try{
			condition.await();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public void awaitMethod(){
		try{
			lock.lock();
			System.out.println("await begin at time =" + System.currentTimeMillis());
			condition.await();
			System.out.println("await end at time=" + System.currentTimeMillis());
		} catch(InterruptedException e){
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
	
	public void notifyMethod(){
		try{
			lock.lock();
			System.out.println("signal begin at time=" + System.currentTimeMillis());
			condition.signal();
		} finally{
			lock.unlock();
		}
	}
}
