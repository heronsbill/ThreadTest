package com.mxm.lock.excuteInOrder;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run {
	public static ReentrantLock lock = new ReentrantLock();
	public static Condition conditionA = lock.newCondition();
	public static Condition conditionB = lock.newCondition();
	public static Condition conditionC = lock.newCondition();
	
	
	public static void main(String[] args){
		Thread threadA = new Thread(){
			@Override
			public void run(){
				try{
					lock.lock();
					while (Order.FIRST_EXCUTE != 1){
						conditionA.await();
					}
					System.out.println("ThreadA" + Order.FIRST_EXCUTE);
					Order.FIRST_EXCUTE = 2;
					conditionB.signalAll();
				} catch (InterruptedException e){
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		
		Thread threadB = new Thread(){
			@Override
			public void run(){
				try{
					lock.lock();
					while (Order.FIRST_EXCUTE != 2){
						conditionB.await();
					}
					System.out.println("ThreadB" + Order.FIRST_EXCUTE);
					Order.FIRST_EXCUTE = 3;
					conditionC.signalAll();
				} catch (InterruptedException e){
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		
		Thread threadC = new Thread(){
			@Override
			public void run(){
				try{
					lock.lock();
					while (Order.FIRST_EXCUTE != 3){
						conditionC.await();
					}
					System.out.println("ThreadC" + Order.FIRST_EXCUTE);
					Order.FIRST_EXCUTE = 1;
					conditionA.signalAll();
				} catch (InterruptedException e){
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		
		Thread[] threadAs = new Thread[5];
		Thread[] threadBs = new Thread[5];
		Thread[] threadCs = new Thread[5];
		
		for (int i = 0; i < 5; i++){
			threadCs[i] = new Thread(threadC);
			threadBs[i] = new Thread(threadB);
			threadAs[i] = new Thread(threadA);
			
			threadCs[i].start();
			threadBs[i].start();
			threadAs[i].start();
		}
		
		try {
			Thread.sleep(1000);
			System.out.println(Order.FIRST_EXCUTE);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
