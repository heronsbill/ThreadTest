package com.mxm.lock.p_c_ooo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Producer {
	private Lock lock;
	private Condition condition;
	
	public Producer(Lock lock, Condition condition) {
		this.lock = lock;
		this.condition = condition;
	}

	public void produce(){
		try{
			lock.lock();
			while (!"".equals(Goods.GOOD_VALUE)){
				condition.await();
			}
			String value = System.currentTimeMillis() + "_" + System.nanoTime();
			System.out.println("producer value = " + value);
			Goods.GOOD_VALUE = value;
			condition.signal();
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
}
