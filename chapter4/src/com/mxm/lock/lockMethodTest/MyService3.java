package com.mxm.lock.lockMethodTest;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService3 {
	public ReentrantLock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();
	
	/**
	 * lock.lockInterruptibly()线程在获取锁的时候，如果当前线程已经被中断，则抛异常
	 */
	public void lockInterruptiblyMethod(){
		try {
			lock.lockInterruptibly();
			System.out.println("lock begin " + Thread.currentThread().getName());
			for (int i = 0; i < Integer.MAX_VALUE/10; i++){
				String s = new String();
				Math.random();
			}
			System.out.println("lock end " + Thread.currentThread().getName());
		} catch (InterruptedException e){
			System.out.println("lock interrupted " + Thread.currentThread().getName());
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	public void normalMethod(){
		try{
			lock.lock();
			System.out.println("lock begin " + Thread.currentThread().getName());
			Thread.sleep(Integer.MAX_VALUE);
			System.out.println("lock end " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	/**
	 * lock.tryLock() 尝试获取锁，如果有则持有；否则，不再尝试
	 */
	public void tryLockMethod(){
		try {
			if (lock.tryLock()){
				System.out.println(Thread.currentThread().getName() + "获得锁！");
				Thread.sleep(1000);
			} else {
				System.out.println(Thread.currentThread().getName() + "未获得锁！");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	/**
	 * lock.tryLock(Long long, TimeUnit unit)在3秒内尝试获取锁，期间被中断则抛异常，获取不到就结束
	 * 参数：long = 3
	 *     unit = TimeUnit.SECONDS(秒)
	 */
	public void tryLockInTimeMethod(){
		try {
			if (lock.tryLock(3, TimeUnit.SECONDS)){
				System.out.println(Thread.currentThread().getName() + "在3秒内获得锁！");
				Thread.sleep(2000);
			} else {
				System.out.println(Thread.currentThread().getName() + "在3秒内未获得锁！");
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + "在3秒内被中断！");
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	public void awaitMethod(){
		try{
			lock.lock();
			System.out.println("wait begin");
			condition.await();
			System.out.println("wait end");
		} catch (InterruptedException e){
			System.out.println("擦，谁把我中断了！");
			e.printStackTrace();
		} finally {
			System.out.println("await 持有锁？ " + lock.isHeldByCurrentThread());
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	/**
	 * lock.awaitUninterrutibly()等待期间被中断,再次获取到锁时不会抛异常
	 */
	public void awaitUninterruptiblyMethod(){
		try {
			lock.lock();
			condition.awaitUninterruptibly();
		} finally {
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	/**
	 * lock.awaitUntil(Date date)在到达date时间后，会自动唤醒自己
	 */
	public void awaitUntilMethod(){
		try {
			lock.lock();
//			Calendar calendar = Calendar.getInstance();
//			calendar.add(Calendar.SECOND, 2);
			long now = System.currentTimeMillis();
			Date date = new Date(now + 2000);
			System.out.println("wait begin time = " + System.currentTimeMillis());
			condition.awaitUntil(date);
			System.out.println("wait end time = " + System.currentTimeMillis());
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
