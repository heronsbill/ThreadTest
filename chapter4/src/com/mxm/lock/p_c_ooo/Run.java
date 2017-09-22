package com.mxm.lock.p_c_ooo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Run {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		
		final Producer producer = new Producer(lock, condition);
		final Consumer consumer = new Consumer(lock, condition);
		
		Thread threadP = new Thread(){
			@Override
			public void run(){
				while(true){
					producer.produce();
				}
			}
		};
		
		Thread threadC = new Thread(){
			@Override
			public void run(){
				while (true){
					consumer.consume();
				}
			}
		};
		
		threadP.start();
		threadC.start();
	}
}
