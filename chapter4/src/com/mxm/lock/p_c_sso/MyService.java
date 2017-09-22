package com.mxm.lock.p_c_sso;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock(true);
	private Condition conditionP = lock.newCondition();
	private Condition conditionC = lock.newCondition();
	private String value = "";
	
	public void producer(){
		try {
			lock.lock();
			while (!"".equals(this.value)){
				conditionP.await();
			}
			String v = System.currentTimeMillis() + "_" + System.nanoTime();
			System.out.println("ThreadName = " + Thread.currentThread().getName() 
					+ " produce value = " + v);
			this.value = v;
			conditionC.signalAll();
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void consume(){
		try {
			lock.lock();
			while ("".equals(this.value)){
				conditionC.await();
			}
			System.out.println("ThreadName = " + Thread.currentThread().getName() 
					+ " consume value = " + this.value);
			this.value = "";
			conditionP.signalAll();
		} catch(InterruptedException e){
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
}
