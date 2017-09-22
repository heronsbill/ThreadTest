package com.mxm.lock.awaitPartThread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	public Lock lock = new ReentrantLock();
	public Condition conditionA = lock.newCondition();
	public Condition conditionB = lock.newCondition();
	
	public void awaitMethodA(){
		try{
			lock.lock();
			System.out.println("ThreadName = " + Thread.currentThread().getName()
					+ "methodA wait at time =" + System.currentTimeMillis());
			conditionA.await();
			System.out.println("ThreadName = " + Thread.currentThread().getName()
					+ "methodA wait at time =" + System.currentTimeMillis());
		} catch(InterruptedException e){
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
	
	public void awaitMethodB(){
		try{
			lock.lock();
			System.out.println("ThreadName = " + Thread.currentThread().getName()
					+ "methodB wait at time =" + System.currentTimeMillis());
			conditionB.await();
			System.out.println("ThreadName = " + Thread.currentThread().getName()
					+ "methodB wait at time =" + System.currentTimeMillis());
		} catch(InterruptedException e){
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
	
	public void signalMethodA(){
		try{
			lock.lock();
			System.out.println("notify methodA at time =" + System.currentTimeMillis());
			conditionA.signal();
		} finally{
			lock.unlock();
		}
	}
	
	public void signalMethodB(){
		try{
			lock.lock();
			System.out.println("notify methodB at time =" + System.currentTimeMillis());
			conditionB.signalAll();
		} finally{
			lock.unlock();
		}
	}
}
