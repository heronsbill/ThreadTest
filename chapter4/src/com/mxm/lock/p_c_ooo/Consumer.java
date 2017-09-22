package com.mxm.lock.p_c_ooo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Consumer {
	private Lock lock;
	private Condition condition;

	public Consumer(Lock lock, Condition condition){
		this.lock = lock;
		this.condition = condition;
	}
	
	public void consume(){
		try{
			lock.lock();
			while ("".equals(Goods.GOOD_VALUE)){
				condition.await();
			}
			String value = Goods.GOOD_VALUE;
			System.out.println("consumer value = " + value);
			Goods.GOOD_VALUE = "";
			condition.signal();
		} catch(InterruptedException e){
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
}
