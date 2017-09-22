package com.mxm.lock.lockMethodTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Xiaoming.Ma
 *
 */
public class MyService {
	public ReentrantLock lock = new ReentrantLock();
	
	/**
	 * lock.getHoldCount():获取当前线程保持此锁定的个数，即lock()方法的次数
	 */
	public void holdCountService1(){
		try{
			lock.lock();
			System.out.println("holdCountService1 getHoldCount="
					+ lock.getHoldCount());
			holdCountService2();
		} finally {
			lock.unlock();
		}
	}
	
	public void holdCountService2(){
		try{
			lock.lock();
			System.out.println("holdCountService2 getHoldCount="
					+ lock.getHoldCount());
		} finally {
			lock.unlock();
		}
	}
	
	/**
	 * lock.getQueueLength()获得等待锁的进程数
	 */
	public void queueLengthService(){
		try{
			lock.lock();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "进入方法！");
			Thread.sleep(Integer.MAX_VALUE);;
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public Condition condition = lock.newCondition();
	/**
	 * lock.getWaitQueueLength(condition)获取等待condition通知的进程数
	 * lock.hasWaiters(condition)判断是否有线程在等待condition通知
	 */
	public void waitQueueLengthService(){
		try{
			lock.lock();
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAllService(){
		try{
			lock.lock();
			System.out.println("有线程数：" + lock.getWaitQueueLength(condition) 
					+ "在condition的wait状态");
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAllService2(){
		try{
			lock.lock();
			System.out.println("有没有线程在等待condition？" + lock.hasWaiters(condition)
					+ "有多少线程数：" + lock.getWaitQueueLength(condition));
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	/**
	 * lock.hasQueueThread(thread)判断线程thread是否在等待获取锁lock
	 * lock.hasQueueThreads()判断是否有线程在等待获取锁lock
	 */
	public void queueThreadService(){
		try{
			lock.lock();
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
}
