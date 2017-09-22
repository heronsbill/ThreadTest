package com.mxm.lock.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService1 {
	public Lock lock = new ReentrantLock();
	
	public void methodA(){
		try{
			lock.lock();
			System.out.println("methodA begin ThreadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(3000);
			System.out.println("methodA end ThreadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
	
	public void methodB(){
		try{
			lock.lock();
			System.out.println("methodB begin ThreadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(3000);
			System.out.println("methodB end ThreadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
}
